package com.nestvision.nest.proxy.schedule.inhospitaldiagnosis;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;
import com.nestvision.nest.proxy.fhir.service.InhospitalDiagnosisService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InhospitalDiagnosisMessageTests {

    @Autowired
    private InhospitalDiagnosisService inhospitalDiagnosisService;

    @Autowired
    private InhospitalDiagnosisMessageScheduler inhospitalDiagnosisMessageScheduler;

    @Autowired
    private InhospitalDiagnosisMessageSender inhospitalDiagnosisMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InhospitalDiagnosis inhospitalDiagnosis = EntityGenarator.genarate(InhospitalDiagnosis.class);
		inhospitalDiagnosis.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inhospitalDiagnosisMessageSender.createRequestBody(inhospitalDiagnosis);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inhospitalDiagnosis = EntityGenarator.genarateNessaray(InhospitalDiagnosis.class);
        templateResult = inhospitalDiagnosisMessageSender.createRequestBody(inhospitalDiagnosis);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InhospitalDiagnosis inhospitalDiagnosis = EntityGenarator.genarate(InhospitalDiagnosis.class);	
		String uid = UUID.randomUUID().toString();
		inhospitalDiagnosis.setUid(uid);  		 		 
        inhospitalDiagnosisService.save(inhospitalDiagnosis);
        
        inhospitalDiagnosis=inhospitalDiagnosisService.findOne(uid);      
        inhospitalDiagnosisMessageScheduler.doSend(inhospitalDiagnosis);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inhospitalDiagnosis = EntityGenarator.genarateNessaray(InhospitalDiagnosis.class);
        uid = UUID.randomUUID().toString();
        inhospitalDiagnosis.setUid(uid);
        inhospitalDiagnosisService.save(inhospitalDiagnosis);
        
        inhospitalDiagnosis=inhospitalDiagnosisService.findOne(uid);      
        inhospitalDiagnosisMessageScheduler.doSend(inhospitalDiagnosis);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
