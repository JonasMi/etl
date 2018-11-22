package com.nestvision.nest.proxy.schedule.admissionrecord;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;
import com.nestvision.nest.proxy.fhir.service.AdmissionRecordService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmissionRecordMessageTests {

    @Autowired
    private AdmissionRecordService admissionRecordService;

    @Autowired
    private AdmissionRecordMessageScheduler admissionRecordMessageScheduler;

    @Autowired
    private AdmissionRecordMessageSender admissionRecordMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        AdmissionRecord admissionRecord = EntityGenarator.genarate(AdmissionRecord.class);
		admissionRecord.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = admissionRecordMessageSender.createRequestBody(admissionRecord);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        admissionRecord = EntityGenarator.genarateNessaray(AdmissionRecord.class);
        templateResult = admissionRecordMessageSender.createRequestBody(admissionRecord);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		AdmissionRecord admissionRecord = EntityGenarator.genarate(AdmissionRecord.class);	
		String uid = UUID.randomUUID().toString();
		admissionRecord.setUid(uid);  		 		 
        admissionRecordService.save(admissionRecord);
        
        admissionRecord=admissionRecordService.findOne(uid);      
        admissionRecordMessageScheduler.doSend(admissionRecord);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        admissionRecord = EntityGenarator.genarateNessaray(AdmissionRecord.class);
        uid = UUID.randomUUID().toString();
        admissionRecord.setUid(uid);
        admissionRecordService.save(admissionRecord);
        
        admissionRecord=admissionRecordService.findOne(uid);      
        admissionRecordMessageScheduler.doSend(admissionRecord);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
