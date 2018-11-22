package com.nestvision.nest.proxy.schedule;

import java.io.StringReader;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;
import com.nestvision.nest.proxy.fhir.util.NestRequestUtil;
import com.nestvision.nest.proxy.nest.entity.FhirTemplate;
import com.nestvision.nest.proxy.nest.service.FhirTemplateService;
import com.nestvision.nest.proxy.transform.TransformException;
import com.nestvision.nest.proxy.transform.Transformers;
import com.nestvision.nest.proxy.transform.model.NestMessage;
import com.nestvision.nest.proxy.transform.model.NestRequest;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageSenderSupport<T extends FhirResourceEntity> implements ApplicationContextAware {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private FhirTemplateService fhirTemplateService;

    @Autowired
    private Configuration configuration;

    @Value("${queue.message.finished.x}")
    private String finishedMsgExchange;

    private ApplicationContext applicationContext;

    private BaseService<FhirResourceEntity, String> fhirResourceEntityService;

    private static final String SOAPACTION_PREFIX = "http://www.lfwsj.gov.cn/platform/data/";

    protected void sendFinishedMessageToQueue(T message, SoapRequestResult soapRequestResult) {

        NestMessage nestMessage = new NestMessage();
        try {
            String base64 = Transformers.transformToBase64(message);
            nestMessage.setMessageObject(base64);
            nestMessage.setNestRequests(soapRequestResult.getNestRequests());
            byte[] body = Transformers.transformToXml(nestMessage);
            Message amqpMessage = MessageBuilder.withBody(body).build();
            rabbitTemplate.send(finishedMsgExchange, "#", amqpMessage);
        } catch (TransformException e) {
            log.error("转换消息时发生错误:" + e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    public String createRequestBody(Object obj, String templateName) {

        FhirTemplate fhirTemplate = fhirTemplateService.findOne(templateName);
        if (fhirTemplate == null) {
            throw new RuntimeException("没有发现消息内容模板:" + templateName);
        }
        StringReader reader = new StringReader(fhirTemplate.getTemplate());
        try {

            Template template = new Template(templateName, reader, configuration);

            return FreeMarkerTemplateUtils.processTemplateIntoString(template, obj);

        } catch (Exception e) {
            throw new RuntimeException("在解析消息内容模板的时候发生错误:" + e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(reader);
        }

    }

    public String createRequestBody(Object obj) {
        String templateName = obj.getClass().getSimpleName();
        return createRequestBody(obj, templateName);

    }

    protected BaseService<FhirResourceEntity, String> detectServiceBean(FhirResourceEntity fhirResourceEntity) {

        if (this.fhirResourceEntityService == null) {
            String entityClassName = fhirResourceEntity.getClass().getSimpleName();
            String beanName = "default" + entityClassName + "Service";
            log.debug("根据消息类名动态获取对应的Service接口实现,beanName={}", beanName);
            try {

                this.fhirResourceEntityService = applicationContext.getBean(beanName, BaseService.class);

            } catch (BeansException e) {
                log.error("在根据消息类名动态获取对应的Service接口实现的时候发生错误:" + e.getMessage(), e);
                throw e;
            }
        }
        return fhirResourceEntityService;

    }

    protected void removeMessage(T message) {

        BaseService<FhirResourceEntity, String> baseService = detectServiceBean(message);
        baseService.delete(message);
        log.debug("消息实体[class={},uid={}]已经被删除", message.getClass().getName(), message.getUid());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public SoapRequest createSoapRequest(OperationState state, String resourceType, Object obj, String templateName) {
        SoapRequest request = new SoapRequest();
        request.setSoapAction(generateSoapAction(state, resourceType));
        request.setResourceType(resourceType);
        request.setBody(createRequestBody(obj, templateName));
        return request;
    }

    /**
     * 根据操作类型和资源类型生成该次操作的soapAction
     * 
     * @param state
     *            操作类型
     * @param resourceType
     *            资源类型
     * @return soapAction
     */
    @SuppressWarnings("static-access")
    public String generateSoapAction(OperationState state, String resourceType) {
        if ("Basic".equals(resourceType)) {
            throw new UnsupportedOperationException("不支持的 资源:" + resourceType + "生成soapAction");
        }
        StringBuilder sb = new StringBuilder(SOAPACTION_PREFIX);
        Character ch = resourceType.charAt(0);
        String resourceMark = resourceType.replace(ch.charValue(), ch.toLowerCase(ch.charValue()));
        switch (state) {
        case CREATE:
            return sb.append(resourceMark).append("/").append("new").toString();
        case UPDATE:
            return sb.append(resourceMark).append("/").append("update").toString();

        default:
            throw new UnsupportedOperationException("不支持的 OperationState:" + state);
        }
    }

}
