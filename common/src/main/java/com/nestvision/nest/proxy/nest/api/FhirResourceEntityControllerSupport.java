package com.nestvision.nest.proxy.nest.api;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.base.api.RestControllerSupport;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.nest.NestCertificateNotFoundException;
import com.nestvision.nest.proxy.nest.NestRequestException;
import com.nestvision.nest.proxy.nest.api.response.SendResult;
import com.nestvision.nest.proxy.nest.service.NestRequestService;
import com.nestvision.nest.proxy.transform.model.NestRequest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public abstract class FhirResourceEntityControllerSupport<T extends FhirResourceEntity> extends RestControllerSupport {

    @Autowired
    private NestRequestService nestRequestService;

    private Class<T> entityClass;

    public FhirResourceEntityControllerSupport() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        Type[] actualTypes = type.getActualTypeArguments();
        this.entityClass = (Class) actualTypes[0];
    }

    protected boolean hasGetPermission(Class<? extends FhirResourceEntity> clazz, HttpServletRequest request) {
        return true;
    }

    protected boolean hasFindPermission(Class<? extends FhirResourceEntity> clazz, HttpServletRequest request) {
        return true;
    }

    protected boolean hasDeletePermission(Class<? extends FhirResourceEntity> clazz, HttpServletRequest request) {
        return true;
    }

    protected boolean hasSendPermission(Class<? extends FhirResourceEntity> clazz, HttpServletRequest request) {

        return true;
    }

    protected List<NestRequest> findNestRequests(String messageId, boolean success) {
        return nestRequestService.findNestRequests(entityClass, messageId, success);
    }

    protected List<NestRequest> findNestRequests(String messageId) {
        return nestRequestService.findNestRequests(entityClass, messageId);
    }

    protected NestRequest findNestRequestById(String id) {
        return nestRequestService.findOne(entityClass, id);
    }

    protected SendResult internalSendNestRequest(NestRequest nestRequest) {
        SendResult sendResult = null;
        try {
            nestRequestService.retry(nestRequest);
            sendResult = new SendResult(true, true, "发送成功");
        } catch (NestRequestException e) {
            log.error("发送Nest请求发生错误:" + e.getMessage(), e);
            Throwable cause = e.getCause();
            if (cause instanceof NestCertificateNotFoundException) {
                sendResult = new SendResult(false, false, e.getMessage());
            } else {
                sendResult = new SendResult(true, false, e.getMessage());
            }
        }
        return sendResult;

    }

    protected List<SendResult> internalSendAllNestRequests(List<NestRequest> nestRequests) {

        List<SendResult> sendResults = new ArrayList<>(nestRequests.size());
        for (int i = 0; i < nestRequests.size(); i++) {
            NestRequest nestRequest = nestRequests.get(i);
            SendResult sendResult = internalSendNestRequest(nestRequest);
            sendResults.add(sendResult);
        }
        return sendResults;
    }
}
