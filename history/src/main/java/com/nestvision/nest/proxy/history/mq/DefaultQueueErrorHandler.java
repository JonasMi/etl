package com.nestvision.nest.proxy.history.mq;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultQueueErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
        log.error("在处理NestProxy消息的时候发生错误:" + t.getMessage(), t);
        throw new AmqpRejectAndDontRequeueException(t);
    }

}
