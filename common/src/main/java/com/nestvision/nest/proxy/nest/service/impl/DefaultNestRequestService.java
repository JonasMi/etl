package com.nestvision.nest.proxy.nest.service.impl;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.util.NestRequestUtil;
import com.nestvision.nest.proxy.nest.NestCertificateNotFoundException;
import com.nestvision.nest.proxy.nest.NestRequestRetryException;
import com.nestvision.nest.proxy.nest.client.NestClient;
import com.nestvision.nest.proxy.nest.client.NestClientStorage;
import com.nestvision.nest.proxy.nest.client.NestResponse;
import com.nestvision.nest.proxy.nest.service.NestRequestService;
import com.nestvision.nest.proxy.transform.model.NestRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.xml.transform.StringSource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class DefaultNestRequestService implements NestRequestService, ApplicationContextAware {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private ApplicationContext applicationContext;

    private String nestRequestSqlTemplate;

    @Autowired
    private NestClientStorage nestClientStorage;

    private NestRequestRowMapper nestRequestRowMapper = new NestRequestRowMapper();

    @PostConstruct
    private void init() throws IOException {
        Resource resource = applicationContext.getResource("classpath:nest-request.sql");
        InputStream input = null;
        try {
            input = resource.getInputStream();
            this.nestRequestSqlTemplate = IOUtils.toString(resource.getInputStream());
        } catch (IOException e) {
            throw e;
        } finally {
            IOUtils.closeQuietly(input);
        }

    }

    @Override
    public void retry(NestRequest nestRequest) throws NestRequestRetryException {
        String cn = nestRequest.getCn();
        NestClient nestClient = nestClientStorage.fetchCenterNestClient(cn);
        if (nestClient == null) {
            NestRequestRetryException e = new NestRequestRetryException(new NestCertificateNotFoundException(cn));
            NestRequestUtil.wrapException(nestRequest, e);
            throw e;
        }
        StringSource source = new StringSource(nestRequest.getBody());
        String resourceType = nestRequest.getResourceType();
        String soapAction = nestRequest.getSoapAction();
        NestResponse nestResponse = nestClient.request(source, resourceType, soapAction);
        int retryTimes = nestRequest.getRetryTimes() != null ? nestRequest.getRetryTimes().intValue() : 0;
        nestRequest.setRetryTimes(retryTimes + 1);
        NestRequestUtil.wrapResponse(nestRequest, nestResponse);
        synchronizeMessageError(nestRequest);
    }

    private void synchronizeMessageError(NestRequest nestRequest) {
        String clazz = nestRequest.getMessageClass();
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);
        update(tableName, nestRequest);
        String simpleClassName = StringUtils.substringAfterLast(clazz, ".");
        String fhirResourceServiceBeanName = "default" + simpleClassName + "Service";
        BaseService<FhirResourceEntity, String> fhirResourceService = applicationContext.getBean(fhirResourceServiceBeanName, BaseService.class);
        FhirResourceEntity entity = fhirResourceService.findOne(nestRequest.getMessageId());
        entity.setErrorMessage(nestRequest.getErrorMessage());
        if (StringUtils.isEmpty(nestRequest.getProcessResult())) {
            entity.setProcessResult(null);
        } else {
            entity.setProcessResult(FhirResourceEntity.ProcessResult.valueOf(nestRequest.getProcessResult()));
        }

        entity.setDealState(DealState.PROCESSED);
        fhirResourceService.save(entity);
    }

    @Override
    @Transactional
    public void save(Class<? extends FhirResourceEntity> clazz, List<NestRequest> nestRequests) {
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);
        String sql = "insert into " + tableName
                     + "(id,resource_type,soap_action,request_body,cn,sended,success,error_type,error_message,error_detail,process_result,message_id,message_class,message_order,send_time,retry_times) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        List<Object[]> batchArgs = new ArrayList<>(nestRequests.size());

        for (int index = 0; index < nestRequests.size(); index++) {
            NestRequest nestRequest = nestRequests.get(index);
            int success = nestRequest.isSuccess() ? 1 : 0;
            int sended = nestRequest.isSended() ? 1 : 0;
            Date sendTime = null;
            if (nestRequest.getSendTime() != null) {
                sendTime = new Date(nestRequest.getSendTime());
            }
            batchArgs.add(new Object[] { nestRequest.getId(), nestRequest.getResourceType(), nestRequest.getSoapAction(), nestRequest.getBody(),
                                         nestRequest.getCn(), sended, success, nestRequest.getErrorType(), nestRequest.getErrorMessage(),
                                         nestRequest.getErrorDetail(), nestRequest.getProcessResult(), nestRequest.getMessageId(),
                                         nestRequest.getMessageClass(), nestRequest.getMessageOrder(), sendTime,
                                         nestRequest.getRetryTimes() != null ? nestRequest.getRetryTimes().intValue() : 0 });
        }
        try {
            jdbcTemplate.batchUpdate(sql, batchArgs);
        } catch (BadSqlGrammarException e) {
            log.debug("插入nest请求记录失败:" + e.getMessage(), e);
            createNestRequestTable(tableName);
            jdbcTemplate.batchUpdate(sql, batchArgs);
        }

    }

    @Override
    @Transactional
    public void update(Class<? extends FhirResourceEntity> clazz, NestRequest nestRequest) {
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);
        update(tableName, nestRequest);
    }

    @Override
    @Transactional
    public void update(String tableName, NestRequest nestRequest) {
        String sql = "update " + tableName
                     + " set resource_type=?,soap_action=?,request_body=?,cn=?,sended=?,success=?,error_type=?,error_message=?,error_detail=?,process_result,message_id=?,message_class=?,message_order=?,send_time=?,retry_times=? where id =?";
        int success = nestRequest.isSuccess() ? 1 : 0;
        int sended = nestRequest.isSended() ? 1 : 0;
        Date sendTime = null;
        if (nestRequest.getSendTime() != null) {
            sendTime = new Date(nestRequest.getSendTime());
        }
        Object[] args = new Object[] { nestRequest.getResourceType(), nestRequest.getSoapAction(), nestRequest.getBody(), nestRequest.getCn(), sended, success,
                                       nestRequest.getErrorType(), nestRequest.getErrorMessage(), nestRequest.getErrorDetail(), nestRequest.getProcessResult(),
                                       nestRequest.getMessageId(), nestRequest.getMessageClass(), nestRequest.getMessageOrder(), sendTime,
                                       nestRequest.getRetryTimes() != null ? nestRequest.getRetryTimes().intValue() : 0, nestRequest.getId() };
        try {
            jdbcTemplate.update(sql, args);
        } catch (BadSqlGrammarException e) {
            log.debug("更新nest请求记录失败:" + e.getMessage(), e);
            createNestRequestTable(tableName);
            jdbcTemplate.update(sql, args);
        }

    }

    @Override
    @Transactional
    public NestRequest findOne(Class<? extends FhirResourceEntity> clazz, String id) {

        return _findOne(clazz, id, false);
    }

    @Override
    @Transactional
    public NestRequest findOne(String tableName, String id) {
        return _findOne(tableName, id, false);
    }

    private NestRequest _findOne(String tableName, String id, boolean hasTryCreateTable) {

        String sql = "select * from " + tableName + " where id=?";
        try {
            List<NestRequest> list = jdbcTemplate.query(sql, new Object[] { id }, nestRequestRowMapper);
            if (!list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (BadSqlGrammarException e) {
            if (!hasTryCreateTable) {
                createNestRequestTable(tableName);
                return _findOne(tableName, id, true);
            }
            throw e;
        }

    }

    private NestRequest _findOne(Class<? extends FhirResourceEntity> clazz, String id, boolean hasTryCreateTable) {

        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);
        return _findOne(tableName, id, hasTryCreateTable);

    }

    private List<NestRequest> _findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId, boolean hasTryCreateTable) {
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);

        // 重构 By 丁建，按时间降序排序
        String sql = "select * from " + tableName + " where message_id=? order by send_time DESC";
        try {
            return jdbcTemplate.query(sql, new Object[] { messageId }, nestRequestRowMapper);
        } catch (BadSqlGrammarException e) {
            if (!hasTryCreateTable) {
                createNestRequestTable(tableName);
                return _findNestRequests(clazz, messageId, true);
            }
            throw e;
        }
    }

    @Override
    @Transactional
    public List<NestRequest> findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId) {

        return _findNestRequests(clazz, messageId, false);

    }

    private List<NestRequest> _findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId, boolean success, boolean hasTryCreateTable) {
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);

        String sql = "select * from " + tableName + " where message_id=? and success=? order by message_order ASC";
        int successValue = success ? 1 : 0;
        try {
            return jdbcTemplate.query(sql, new Object[] { messageId, successValue }, nestRequestRowMapper);
        } catch (BadSqlGrammarException e) {
            if (!hasTryCreateTable) {
                createNestRequestTable(tableName);
                return _findNestRequests(clazz, messageId, success, true);
            }
            throw e;
        }
    }

    @Override
    @Transactional
    public List<NestRequest> findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId, boolean success) {

        return _findNestRequests(clazz, messageId, success, false);

    }

    @Override
    @Transactional
    public void deleteNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId) {
        String tableName = NestRequestUtil.detectNestRequestTableName(clazz);
        try {
            jdbcTemplate.update("delete from " + tableName + " where message_id =?", messageId);
        } catch (BadSqlGrammarException e) {
            createNestRequestTable(tableName);
            jdbcTemplate.update("delete from " + tableName + " where message_id =?", messageId);
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    private void createNestRequestTable(String nestRequestTableName) {
        String sql = StringUtils.replace(nestRequestSqlTemplate, "${table_name}", nestRequestTableName);
        jdbcTemplate.execute(sql);
        log.info("创建了新的消息请求记录表:{}", nestRequestTableName);
    }

    private class NestRequestRowMapper implements RowMapper<NestRequest> {

        @Override
        public NestRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
            NestRequest nestRequest = new NestRequest();
            nestRequest.setId(rs.getString("id"));
            nestRequest.setBody(rs.getString("request_body"));
            nestRequest.setErrorDetail(rs.getString("error_detail"));
            nestRequest.setErrorMessage(rs.getString("error_message"));
            nestRequest.setErrorType(rs.getString("error_type"));
            nestRequest.setResourceType(rs.getString("resource_type"));
            nestRequest.setSended(rs.getBoolean("sended"));
            nestRequest.setSoapAction(rs.getString("soap_action"));
            nestRequest.setSuccess(rs.getBoolean("success"));
            nestRequest.setMessageOrder((Integer) rs.getObject("message_order"));
            nestRequest.setMessageId(rs.getString("message_id"));
            nestRequest.setMessageClass(rs.getString("message_class"));
            nestRequest.setCn(rs.getString("cn"));
            Timestamp timestamp = rs.getTimestamp("send_time");
            if (timestamp != null) {
                nestRequest.setSendTime(timestamp.getTime());
            }
            nestRequest.setRetryTimes((Integer) rs.getObject("retry_times"));
            return nestRequest;
        }

    }

}
