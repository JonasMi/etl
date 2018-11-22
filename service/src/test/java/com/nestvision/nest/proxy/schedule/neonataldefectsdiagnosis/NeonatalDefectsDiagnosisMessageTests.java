package com.nestvision.nest.proxy.schedule.neonataldefectsdiagnosis;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.NeonatalDefectsDiagnosis;
import com.nestvision.nest.proxy.fhir.service.NeonatalDefectsDiagnosisService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NeonatalDefectsDiagnosisMessageTests {

    @Autowired
    private NeonatalDefectsDiagnosisService neonatalDefectsDiagnosisService;

    @Autowired
    private NeonatalDefectsDiagnosisMessageScheduler neonatalDefectsDiagnosisMessageScheduler;

    @Autowired
    private NeonatalDefectsDiagnosisMessageSender neonatalDefectsDiagnosisMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        NeonatalDefectsDiagnosis neonatalDefectsDiagnosis = EntityGenarator.genarate(NeonatalDefectsDiagnosis.class);
		neonatalDefectsDiagnosis.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = neonatalDefectsDiagnosisMessageSender.createRequestBody(neonatalDefectsDiagnosis);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        neonatalDefectsDiagnosis = EntityGenarator.genarateNessaray(NeonatalDefectsDiagnosis.class);
        templateResult = neonatalDefectsDiagnosisMessageSender.createRequestBody(neonatalDefectsDiagnosis);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		NeonatalDefectsDiagnosis neonatalDefectsDiagnosis = EntityGenarator.genarate(NeonatalDefectsDiagnosis.class);	
		String uid = UUID.randomUUID().toString();
		neonatalDefectsDiagnosis.setUid(uid);  		 		 
        neonatalDefectsDiagnosisService.save(neonatalDefectsDiagnosis);
        
        neonatalDefectsDiagnosis=neonatalDefectsDiagnosisService.findOne(uid);      
        neonatalDefectsDiagnosisMessageScheduler.doSend(neonatalDefectsDiagnosis);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        neonatalDefectsDiagnosis = EntityGenarator.genarateNessaray(NeonatalDefectsDiagnosis.class);
        uid = UUID.randomUUID().toString();
        neonatalDefectsDiagnosis.setUid(uid);
        neonatalDefectsDiagnosisService.save(neonatalDefectsDiagnosis);
        
        neonatalDefectsDiagnosis=neonatalDefectsDiagnosisService.findOne(uid);      
        neonatalDefectsDiagnosisMessageScheduler.doSend(neonatalDefectsDiagnosis);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
