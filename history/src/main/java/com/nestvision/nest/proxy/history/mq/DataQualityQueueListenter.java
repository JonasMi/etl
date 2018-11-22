package com.nestvision.nest.proxy.history.mq;

import java.util.Collection;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.nest.entity.DataQualityReport;
import com.nestvision.nest.proxy.nest.service.DataQualityReportService;
import com.nestvision.nest.proxy.transform.TransformException;
import com.nestvision.nest.proxy.transform.Transformers;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataQualityQueueListenter implements MessageListener {
    @Autowired
    private DataQualityReportService dataQualityReportService;

    @SuppressWarnings("unchecked")
    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        Collection<DataQualityReport> dataQualityReports;
        try {
            dataQualityReports = Transformers.transformCollectionFromBase64Bytes(body, Collection.class);
        } catch (TransformException e) {
            log.error("在处理数据质量报告消息时发生错误:" + e.getMessage(), e);
            throw new MessageProcessException(e);
        }
        dataQualityReportService.saveAll(dataQualityReports);
      

    }

}
