package com.nestvision.nest.proxy.schedule;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.nest.client.NestClient;
import com.nestvision.nest.proxy.nest.client.NestClientStorage;
import com.nestvision.nest.proxy.nest.client.NestResponse;
import com.nestvision.nest.proxy.nest.service.NestCertificateService;
import com.nestvision.nest.proxy.transform.model.NestRequest;
import com.nestvision.nest.proxy.utils.FhirResourceUtils;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.dom4j.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.xml.transform.StringSource;

import java.util.List;

@Slf4j
public abstract class AbstractMultipleMessageSender<T extends FhirResourceEntity> extends MessageSenderSupport<T> implements MessageSender<T> {

    @Autowired
    private NestClientStorage nestClientStorage;

    @Autowired
    private NestCertificateService nestCertificateService;

    @Override
    public void send(T message) {

        String upHospital = message.getUpHospital();

        NestClient nestClient = nestClientStorage.fetchCenterNestClient(upHospital);
        if (nestClient == null) {
            throw new MessageSendException("未发现医院[" + upHospital + "的Nest中心机访问证书,消息已经取消发送", false, true);
        }
        List<SoapRequest> soapRequests = createSoapRequests(message);
        if (soapRequests == null || soapRequests.isEmpty()) {
            throw new MessageSendException("消息[{" + message.getClass().getSimpleName() + "}-{" + message.getUid() + "}]没有解析出任何有效的soapRequest,消息已经取消发送", false,
                                           true);

        }
        if (!beforeRequest(message)) {
            throw new MessageSendException("消息[{" + message.getClass().getSimpleName() + "}-{" + message.getUid() + "}]", false, true);

        }
        SoapRequestResult soapRequestResult = new SoapRequestResult(message, soapRequests);
        try {
            List<NestResponse> result = sendAll(nestClient, message, soapRequests, soapRequestResult.getNestRequests());
            result.forEach(nestResponse -> {
                message.setErrorMessage(nestResponse.getFaultString());
                message.setCdrId(nestResponse.getCdrId());
                if (nestResponse.isSuccess()) {
                    message.setProcessResult(FhirResourceEntity.ProcessResult.SUCCESS);
                } else {
                    //TODO 根据不同的异常 设置不同的处理结果
                    message.setProcessResult(FhirResourceEntity.ProcessResult.GENERIC_EXCEPTION);
                }
            });
            onRequestSuccess(message);
        } finally {
            message.setDealState(DealState.PROCESSED);
            sendFinishedMessageToQueue(message, soapRequestResult);// 将完成消息发送的MQ
            removeMessage(message);// 删除已经发送过的消息
            onRequestFinish(message);
        }

    }

    protected void onRequestFinish(T message) {
        log.debug("消息[{}]已经发送完毕", message.getUid());
    }

    protected void onRequestSuccess(T message) {
        log.debug("消息[{}]已经发送成功", message.getUid());
    }

    protected boolean beforeRequest(T message) {
        return true;
    }

    private List<NestResponse> sendAll(NestClient nestClient, T message, List<SoapRequest> soapRequests, List<NestRequest> nestRequests) {
        List<NestResponse> responses = Lists.newArrayList();
        for (int i = 0; i < soapRequests.size(); i++) {

            SoapRequest soapRequest = soapRequests.get(i);
            NestRequest nestRequest = nestRequests.get(i);
            nestRequest.setSendTime(System.currentTimeMillis());

            NestResponse nestResponse = sendSingle(nestClient, message, i, soapRequest);

            nestRequest.setSuccess(nestResponse.isSuccess());
            nestRequest.setErrorMessage(nestResponse.getFaultString());

            if (nestResponse.isSuccess()) {
                nestRequest.setProcessResult(FhirResourceEntity.ProcessResult.SUCCESS.name());
            } else {
                //TODO 根据不同的异常 设置不同的处理结果
                nestRequest.setProcessResult(FhirResourceEntity.ProcessResult.GENERIC_EXCEPTION.name());
            }

            nestRequest.setSended(true);
            onRequestFinish(message, i, soapRequest);

            responses.add(nestResponse);
        }
        return responses;
    }

    private String[] getNamespaceAndValue(NestRequest request) {
        Document document = FhirResourceUtils.createDocument(request.getBody().getBytes());
        String namespace = FhirResourceUtils.getIdentifierNamespace(document);
        String value = FhirResourceUtils.getIdentifierValue(document);
        return new String[] { namespace, value };
    }

    protected void onRequestFinish(T message, int index, SoapRequest soapRequest) {
        if (log.isDebugEnabled()) {
            log.debug("消息[{}]的第{}个请求[resourceType ={},soapAction={},已经发送完毕", message.getUid(), (index + 1), soapRequest.getResourceType(),
                      soapRequest.getSoapAction());
        }

    }

    protected void onRequestSuccess(T message, int index, SoapRequest soapRequest) {
        if (log.isDebugEnabled()) {
            log.debug("消息[{}]的第{}个请求[resourceType ={},soapAction={},已经发送成功", message.getUid(), (index + 1), soapRequest.getResourceType(),
                      soapRequest.getSoapAction());
        }
    }

    private void internalRecieveResponse(T message, int index, SoapRequest soapRequest, NestResponse response) {
        log.debug("消息[{}-{}]的第{}条请求已经处理完毕,请求响应内容:\n{}", message.getClass().getSimpleName(), message.getUid(), index + 1, response);

        if (log.isDebugEnabled()) {
            log.debug("消息[{}-{}]的第{}条请求响应已经解析完成,响应:[success={}]", message.getClass().getSimpleName(), message.getUid(), index + 1, response.isSuccess());
        }
        if (response.isSuccess()) {
            onRequestSuccess(message, index, soapRequest);
        }
    }

    private NestResponse sendSingle(NestClient nestClient, T message, int index, SoapRequest soapRequest) {

        String requestBody = soapRequest.getBody();
        String resourceType = soapRequest.getResourceType();
        String soapAction = soapRequest.getSoapAction();

        if (log.isDebugEnabled()) {
            log.debug("正在发送消息[{}-{}]至Nest平台:resource=[{}],soapAction=[{}],body=[\n{}]", message.getClass().getSimpleName(), message.getUid(), resourceType,
                      soapAction, requestBody);
        }
        NestResponse response = nestClient.request(new StringSource(requestBody), resourceType, soapAction);
        internalRecieveResponse(message, index, soapRequest, response);
        return response;
    }

    protected abstract List<SoapRequest> createSoapRequests(T message);

}
