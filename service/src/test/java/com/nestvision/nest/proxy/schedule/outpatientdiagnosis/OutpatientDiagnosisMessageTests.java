package com.nestvision.nest.proxy.schedule.outpatientdiagnosis;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OutpatientDiagnosisService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientDiagnosisMessageTests {

    @Autowired
    private OutpatientDiagnosisService outpatientDiagnosisService;

    @Autowired
    private OutpatientDiagnosisMessageScheduler outpatientDiagnosisMessageScheduler;

    @Autowired
    private OutpatientDiagnosisMessageSender outpatientDiagnosisMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientDiagnosis outpatientDiagnosis = EntityGenarator.genarate(OutpatientDiagnosis.class);
		outpatientDiagnosis.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientDiagnosisMessageSender.createRequestBody(outpatientDiagnosis);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientDiagnosis = EntityGenarator.genarateNessaray(OutpatientDiagnosis.class);
        templateResult = outpatientDiagnosisMessageSender.createRequestBody(outpatientDiagnosis);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientDiagnosis outpatientDiagnosis = EntityGenarator.genarate(OutpatientDiagnosis.class);	
		String uid = UUID.randomUUID().toString();
		outpatientDiagnosis.setUid(uid);  		 		 
        outpatientDiagnosisService.save(outpatientDiagnosis);
        
        outpatientDiagnosis=outpatientDiagnosisService.findOne(uid);      
        outpatientDiagnosisMessageScheduler.doSend(outpatientDiagnosis);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientDiagnosis = EntityGenarator.genarateNessaray(OutpatientDiagnosis.class);
        uid = UUID.randomUUID().toString();
        outpatientDiagnosis.setUid(uid);
        outpatientDiagnosisService.save(outpatientDiagnosis);
        
        outpatientDiagnosis=outpatientDiagnosisService.findOne(uid);      
        outpatientDiagnosisMessageScheduler.doSend(outpatientDiagnosis);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
