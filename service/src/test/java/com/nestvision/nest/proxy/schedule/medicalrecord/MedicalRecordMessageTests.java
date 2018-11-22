package com.nestvision.nest.proxy.schedule.medicalrecord;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;
import com.nestvision.nest.proxy.fhir.service.MedicalRecordService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicalRecordMessageTests {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @Autowired
    private MedicalRecordMessageScheduler medicalRecordMessageScheduler;

    @Autowired
    private MedicalRecordMessageSender medicalRecordMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        MedicalRecord medicalRecord = EntityGenarator.genarate(MedicalRecord.class);
		medicalRecord.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = medicalRecordMessageSender.createRequestBody(medicalRecord);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        medicalRecord = EntityGenarator.genarateNessaray(MedicalRecord.class);
        templateResult = medicalRecordMessageSender.createRequestBody(medicalRecord);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		MedicalRecord medicalRecord = EntityGenarator.genarate(MedicalRecord.class);	
		String uid = UUID.randomUUID().toString();
		medicalRecord.setUid(uid);  		 		 
        medicalRecordService.save(medicalRecord);
        
        medicalRecord=medicalRecordService.findOne(uid);      
        medicalRecordMessageScheduler.doSend(medicalRecord);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        medicalRecord = EntityGenarator.genarateNessaray(MedicalRecord.class);
        uid = UUID.randomUUID().toString();
        medicalRecord.setUid(uid);
        medicalRecordService.save(medicalRecord);
        
        medicalRecord=medicalRecordService.findOne(uid);      
        medicalRecordMessageScheduler.doSend(medicalRecord);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
