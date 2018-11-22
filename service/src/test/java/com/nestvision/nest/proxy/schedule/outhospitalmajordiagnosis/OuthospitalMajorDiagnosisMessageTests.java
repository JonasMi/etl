package com.nestvision.nest.proxy.schedule.outhospitalmajordiagnosis;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalMajorDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalMajorDiagnosisService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OuthospitalMajorDiagnosisMessageTests {

    @Autowired
    private OuthospitalMajorDiagnosisService outhospitalMajorDiagnosisService;

    @Autowired
    private OuthospitalMajorDiagnosisMessageScheduler outhospitalMajorDiagnosisMessageScheduler;

    @Autowired
    private OuthospitalMajorDiagnosisMessageSender outhospitalMajorDiagnosisMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OuthospitalMajorDiagnosis outhospitalMajorDiagnosis = EntityGenarator.genarate(OuthospitalMajorDiagnosis.class);
		outhospitalMajorDiagnosis.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outhospitalMajorDiagnosisMessageSender.createRequestBody(outhospitalMajorDiagnosis);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outhospitalMajorDiagnosis = EntityGenarator.genarateNessaray(OuthospitalMajorDiagnosis.class);
        templateResult = outhospitalMajorDiagnosisMessageSender.createRequestBody(outhospitalMajorDiagnosis);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OuthospitalMajorDiagnosis outhospitalMajorDiagnosis = EntityGenarator.genarate(OuthospitalMajorDiagnosis.class);	
		String uid = UUID.randomUUID().toString();
		outhospitalMajorDiagnosis.setUid(uid);  		 		 
        outhospitalMajorDiagnosisService.save(outhospitalMajorDiagnosis);
        
        outhospitalMajorDiagnosis=outhospitalMajorDiagnosisService.findOne(uid);      
        outhospitalMajorDiagnosisMessageScheduler.doSend(outhospitalMajorDiagnosis);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outhospitalMajorDiagnosis = EntityGenarator.genarateNessaray(OuthospitalMajorDiagnosis.class);
        uid = UUID.randomUUID().toString();
        outhospitalMajorDiagnosis.setUid(uid);
        outhospitalMajorDiagnosisService.save(outhospitalMajorDiagnosis);
        
        outhospitalMajorDiagnosis=outhospitalMajorDiagnosisService.findOne(uid);      
        outhospitalMajorDiagnosisMessageScheduler.doSend(outhospitalMajorDiagnosis);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
