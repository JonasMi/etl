package com.nestvision.nest.proxy.schedule;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.poi.hssf.record.formula.functions.True;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.annotation.Scheduled;

import com.nestvision.nest.proxy.fhir.anotaion.Identifier;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.hibernate.EntityManager;
import com.nestvision.nest.proxy.nest.entity.DataQuaityReportInvalidColumn;
import com.nestvision.nest.proxy.nest.entity.DataQualityReport;
import com.nestvision.nest.proxy.nest.service.TableLogicPhysicsMappingService;
import com.nestvision.nest.proxy.transform.TransformException;
import com.nestvision.nest.proxy.transform.Transformers;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractMessageScheduler<T extends FhirResourceEntity> implements MessageScheduler {

    @Autowired
    private MessageLocker messageLocker;

    @Value("${message.default.schedule.batchSize:100}")
    private int scanBatchSize = 100;

    @Value("${queue.message.data.quality.x}")
    private String dataQualityMsgExchange;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private TableLogicPhysicsMappingService tableLogicPhysicsMappingService;

    @Override
    @Scheduled(cron = "${message.default.schedule.corn:0/3 * * * * ?}")
    public Result schedule() {

        log.debug("{}-开始执行消息发送计划任务...", this.getClass().getSimpleName());
        Result result = internSchedule();
        log.debug("{}-执行完成消息发送计划任务,发送成功:{}条,发送取消:{}条,发送错误:{}条,合计:{}条", this.getClass().getSimpleName(), result.getSuccessTotal(), result.getCancelTotal(),
                  result.getErrorTotal(), result.getTotal());
        return result;
    }

    private void execute(T fhirResourceEntity, Result result) throws Exception {
        try {
            send(fhirResourceEntity);
            result.incrementSuccessTotal(1);
        } catch (Exception e) {
            if (e instanceof MessageSendException) {
                MessageSendException messageSendException = (MessageSendException) e;
                if (messageSendException.isSendCancel()) {
                    result.incrementCancelTotal(1);
                }
                if (messageSendException.isSendError()) {
                    result.incrementErrorTotal(1);
                }
            } else {
                result.incrementErrorTotal(1);
            }

            throw e;
        }
    }

    private String getIdentifier(Object fhirResourceEntity) {
        String identifier = "";
        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(fhirResourceEntity);
        int i = 0;
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String fieldName = propertyDescriptor.getName();
            Field field = FieldUtils.getField(fhirResourceEntity.getClass(), fieldName, true);
            if (!fieldName.equals("class") && field.getAnnotation(Identifier.class) != null) {
                Method readMethod = propertyDescriptor.getReadMethod();
                try {
                    Object value = readMethod.invoke(fhirResourceEntity);
                    if (value != null) {
                        if (i > 0) {
                            identifier += "_" + value.toString();
                        } else {
                            identifier += value.toString();
                        }
                        i++;
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    log.error(e.getMessage(), e);
                    throw new IdentifierGetException(e);
                }
            }
        }
        return identifier;
    }

    private List<DataQualityReport> convertAll(MessageValidateResult messageValidateResult) {
        List<DataQualityReport> reports = new ArrayList<>();
        DataQualityReport currentReport = convert(messageValidateResult);
        reports.add(currentReport);

        List<MessageValidateResult> internalResults = messageValidateResult.getInternalResults();

        for (MessageValidateResult internalResult : internalResults) {

            List<DataQualityReport> internalReports = convertAll(internalResult);
            reports.addAll(internalReports);

        }
        return reports;
    }

    private DataQualityReport convert(MessageValidateResult messageValidateResult) {
        FhirResourceEntity fhirResourceEntity = (FhirResourceEntity) messageValidateResult.getSource();
        DataQualityReport dataQualityReport = new DataQualityReport();
        dataQualityReport.setDealState(fhirResourceEntity.getDealState());
        dataQualityReport.setDeveloper(fhirResourceEntity.getDeveloper());
        dataQualityReport.setDeveloperSystemType(fhirResourceEntity.getDeveloperSystemType());
        dataQualityReport.setMessageId(fhirResourceEntity.getUid());
        dataQualityReport.setMessageType(fhirResourceEntity.getClass().getSimpleName());
        dataQualityReport.setOperationState(fhirResourceEntity.getOperationState());
        dataQualityReport.setUpHospital(fhirResourceEntity.getUpHospital());
        dataQualityReport.setUpTime(fhirResourceEntity.getUpTime());
        dataQualityReport.setIdentifier(getIdentifier(messageValidateResult.getSource()));
        String physicalTableName = entityManager.getTableName(fhirResourceEntity.getClass());
        physicalTableName = StringUtils.upperCase(physicalTableName);
        String logicTableName = tableLogicPhysicsMappingService.getTableLogicName(physicalTableName);
        if (StringUtils.isBlank(logicTableName)) {
            logicTableName = physicalTableName;
        }

        dataQualityReport.setLogicTableName(logicTableName);
        dataQualityReport.setPhysicalTableName(physicalTableName);
        List<InvalidColumn> invalidColumns = messageValidateResult.getInvalidColumns();
        dataQualityReport.setInvalidColumnsTotal(invalidColumns.size());
        List<DataQuaityReportInvalidColumn> dataQuaityReportInvalidColumns = new ArrayList<>(invalidColumns.size());
        for (InvalidColumn invalidColumn : invalidColumns) {
            DataQuaityReportInvalidColumn dataQuaityReportInvalidColumn = new DataQuaityReportInvalidColumn();
            dataQuaityReportInvalidColumn.setName(invalidColumn.getName());
            dataQuaityReportInvalidColumn.setDisplayName(invalidColumn.getDisplayName());
            dataQuaityReportInvalidColumn.setDataQualityReport(dataQualityReport);
            dataQuaityReportInvalidColumn.setInvalidMessage(invalidColumn.getInvalidMessage());
            dataQuaityReportInvalidColumn.setInvalidType(invalidColumn.getInvalidType());
            dataQuaityReportInvalidColumn.setColumnValue(invalidColumn.getColumnValue());
            dataQuaityReportInvalidColumns.add(dataQuaityReportInvalidColumn);
        }
        dataQualityReport.setDataQuaityReportInvalidColumns(dataQuaityReportInvalidColumns);

        return dataQualityReport;
    }

    private void sendDataQualityReport(MessageValidateResult messageValidateResult) {

        List<DataQualityReport> reports = convertAll(messageValidateResult);
        try {
            byte[] base64 = Transformers.transformToBase64Bytes(reports);
            Message amqpMessage = MessageBuilder.withBody(base64).build();
            rabbitTemplate.send(dataQualityMsgExchange, "#", amqpMessage);
        } catch (TransformException e) {
            log.error("转换消息时发生错误:" + e.getMessage() + ",数据质量报告未发送成功", e);
        }

    }

    protected Result internSchedule() {

        final Result result = new Result();// 任务处理结果

        final Page<T> page = scanOnce(0, scanBatchSize);

        final List<T> fhirResourceEntities = page.getContent();

        for (T fhirResourceEntity : fhirResourceEntities) {

            MessageValidateResult messageValidateResult = doValidate(fhirResourceEntity);

            boolean execute = messageValidateResult == null || messageValidateResult.isValid();

            //TODO 这里必须是execute 上线时需要注意。。。
            if (execute) {
                try {
                    execute(fhirResourceEntity, result);
                } catch (Exception e) {
                    log.error("在发送消息时发生错误:" + e.getMessage(), e);
                }
            } else {
                result.incrementCancelTotal(1);
                for(InvalidColumn invalidColumn: messageValidateResult.getInvalidColumns()){
                	log.error(invalidColumn.getName()+ invalidColumn.getInvalidMessage()+invalidColumn.getDisplayName());
                }
                for(MessageValidateResult re : messageValidateResult.getInternalResults()){
                	for(InvalidColumn invalidColumn: re.getInvalidColumns()){
                    	log.error(invalidColumn.getName()+ invalidColumn.getInvalidMessage()+invalidColumn.getDisplayName());
                    }
                }
                
            }

            doDelete(fhirResourceEntity);
            sendDataQualityReport(messageValidateResult);
        }

        return result;
    }

    protected void send(T fhirResourceEntity) throws Exception {

        final String resourceName = fhirResourceEntity.getClass().getSimpleName();

        final String resourceId = fhirResourceEntity.getUid();

        final String threadName = Thread.currentThread().getName();

        String locked = messageLocker.getLockOwnner(resourceName, resourceId);

        if (locked == null) {
            messageLocker.lock(threadName, resourceName, resourceId);
            log.debug("开始发送消息,{}-已经锁定消息[{}:{}]", threadName, resourceName, resourceId);
            try {
                doSend(fhirResourceEntity);
            } catch (Exception e) {
                throw e;
            } finally {
                log.debug("消息发送完毕,{}-已经解锁消息[{}:{}]", threadName, resourceName, resourceId);
                messageLocker.unlock(resourceName, resourceId);
            }

        } else {
            log.debug("{}-消息[{}:{}]已经被线程{}锁定,取消发送", threadName, resourceName, resourceId, locked);
        }

    }

    protected abstract Page<T> scanOnce(int page, int size);

    protected abstract void doSend(T fhirResourceEntity);

    protected abstract MessageValidateResult doValidate(T fhirResourceEntity);

    protected abstract void doDelete(T fhirResourceEntity);

}
