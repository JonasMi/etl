package com.nestvision.nest.proxy.schedule;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;

@Component
public abstract class AbstractMessageSender<T extends FhirResourceEntity> extends AbstractMultipleMessageSender<T> {

    private String defaultResourceType;

    public AbstractMessageSender() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        Class<?> clazz = (Class) type.getActualTypeArguments()[0];
        this.defaultResourceType = clazz.getSimpleName();
    }

    @Override
    protected final List<SoapRequest> createSoapRequests(T message) {

        SoapRequest soapRequest = new SoapRequest();
        soapRequest.setResourceType(detectResourceType());
        soapRequest.setSoapAction(detectSoapAction(message.getOperationState()));
        soapRequest.setBody(createRequestBody(message));
        return Arrays.asList(soapRequest);
    }

    /**
     * 根据操作状态,确定SoapAction
     * 
     * @param state
     *            操作状态枚举
     * @return soapAction
     */
    protected abstract String detectSoapAction(OperationState state);

    protected String detectResourceType() {
        return this.defaultResourceType;
    }

}
