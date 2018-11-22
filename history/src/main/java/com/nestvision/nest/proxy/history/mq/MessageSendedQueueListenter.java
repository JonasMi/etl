package com.nestvision.nest.proxy.history.mq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.history.RetryTaskFactory;
import com.nestvision.nest.proxy.history.entity.RetryTask;
import com.nestvision.nest.proxy.history.service.HistoryService;
import com.nestvision.nest.proxy.history.service.RetryTaskService;
import com.nestvision.nest.proxy.transform.TransformException;
import com.nestvision.nest.proxy.transform.Transformers;
import com.nestvision.nest.proxy.transform.model.NestMessage;
import com.nestvision.nest.proxy.transform.model.NestRequest;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageSendedQueueListenter implements MessageListener {

    @Autowired
    private HistoryService historyService;

    @Autowired
    private RetryTaskService retryTaskService;

    @Override
    public void onMessage(Message message) {

        NestMessage nestMessage = transformNestMessage(message);
        String messageObject = nestMessage.getMessageObject();
        List<NestRequest> nestRequests = nestMessage.getNestRequests();
        FhirResourceEntity fhirResourceEntity = transformFhirResourceEntity(messageObject);
        saveMessageHistory(fhirResourceEntity, nestRequests);
        List<NestRequest> retryRequests = new ArrayList<>();
        for (NestRequest nestRequest : nestRequests) {
            if (nestRequest.isSended()) {
                if (retryTaskService.matchAutoRetry(nestRequest)) {
                    retryRequests.add(nestRequest);
                }
            } else {
                retryRequests.add(nestRequest);// 还未发送的请求,直接加入重发队列中
            }

        }
        if (!retryRequests.isEmpty()) {
            RetryTask retryTask = RetryTaskFactory.newLazyRetryTask(fhirResourceEntity, retryRequests);
            retryTaskService.save(retryTask);

        }

    }

    private NestMessage transformNestMessage(Message message) {
        byte[] body = message.getBody();
        NestMessage nestMessage;
        try {
            nestMessage = Transformers.transformFromXml(body, NestMessage.class);
            return nestMessage;
        } catch (TransformException e) {
            log.error("无法将消息反序列化为原始的 NestMessage java对象:" + e.getMessage(), e);
            throw new MessageProcessException(e);
        }
    }

    private FhirResourceEntity transformFhirResourceEntity(String base64) {
        FhirResourceEntity fhirResourceEntity;
        try {
            fhirResourceEntity = Transformers.transformFromBase64(base64, FhirResourceEntity.class);
            return fhirResourceEntity;
        } catch (TransformException e) {
            log.error("无法将消息反序列化为原始的FhirResourceEntity java对象:" + e.getMessage(), e);
            throw new MessageProcessException(e);
        }
    }

    private void saveMessageHistory(FhirResourceEntity fhirResourceEntity, List<NestRequest> nestRequests) {
        try {
            historyService.add(fhirResourceEntity, nestRequests);
        } catch (Exception e) {
            log.error("保存消息发送历史的时候发生错误:" + e.getMessage(), e);
            throw new MessageProcessException(e);
        }

    }

}
