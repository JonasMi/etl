package com.nestvision.nest.proxy.schedule.outpatientmedicalrecord;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;
import com.nestvision.nest.proxy.fhir.service.OutpatientMedicalRecordService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientMedicalRecordMessageTests {

    @Autowired
    private OutpatientMedicalRecordService outpatientMedicalRecordService;

    @Autowired
    private OutpatientMedicalRecordMessageScheduler outpatientMedicalRecordMessageScheduler;

    @Autowired
    private OutpatientMedicalRecordMessageSender outpatientMedicalRecordMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientMedicalRecord outpatientMedicalRecord = EntityGenarator.genarate(OutpatientMedicalRecord.class);
		outpatientMedicalRecord.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientMedicalRecordMessageSender.createRequestBody(outpatientMedicalRecord);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientMedicalRecord = EntityGenarator.genarateNessaray(OutpatientMedicalRecord.class);
        templateResult = outpatientMedicalRecordMessageSender.createRequestBody(outpatientMedicalRecord);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientMedicalRecord outpatientMedicalRecord = EntityGenarator.genarate(OutpatientMedicalRecord.class);	
		String uid = UUID.randomUUID().toString();
		outpatientMedicalRecord.setUid(uid);  		 		 
        outpatientMedicalRecordService.save(outpatientMedicalRecord);
        
        outpatientMedicalRecord=outpatientMedicalRecordService.findOne(uid);      
        outpatientMedicalRecordMessageScheduler.doSend(outpatientMedicalRecord);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientMedicalRecord = EntityGenarator.genarateNessaray(OutpatientMedicalRecord.class);
        uid = UUID.randomUUID().toString();
        outpatientMedicalRecord.setUid(uid);
        outpatientMedicalRecordService.save(outpatientMedicalRecord);
        
        outpatientMedicalRecord=outpatientMedicalRecordService.findOne(uid);      
        outpatientMedicalRecordMessageScheduler.doSend(outpatientMedicalRecord);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
