package com.nestvision.nest.proxy.schedule.pathologydiagnosis;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;
import com.nestvision.nest.proxy.fhir.service.PathologyDiagnosisService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PathologyDiagnosisMessageTests {

    @Autowired
    private PathologyDiagnosisService pathologyDiagnosisService;

    @Autowired
    private PathologyDiagnosisMessageScheduler pathologyDiagnosisMessageScheduler;

    @Autowired
    private PathologyDiagnosisMessageSender pathologyDiagnosisMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        PathologyDiagnosis pathologyDiagnosis = EntityGenarator.genarate(PathologyDiagnosis.class);
		pathologyDiagnosis.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = pathologyDiagnosisMessageSender.createRequestBody(pathologyDiagnosis);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        pathologyDiagnosis = EntityGenarator.genarateNessaray(PathologyDiagnosis.class);
        templateResult = pathologyDiagnosisMessageSender.createRequestBody(pathologyDiagnosis);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		PathologyDiagnosis pathologyDiagnosis = EntityGenarator.genarate(PathologyDiagnosis.class);	
		String uid = UUID.randomUUID().toString();
		pathologyDiagnosis.setUid(uid);  		 		 
        pathologyDiagnosisService.save(pathologyDiagnosis);
        
        pathologyDiagnosis=pathologyDiagnosisService.findOne(uid);      
        pathologyDiagnosisMessageScheduler.doSend(pathologyDiagnosis);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        pathologyDiagnosis = EntityGenarator.genarateNessaray(PathologyDiagnosis.class);
        uid = UUID.randomUUID().toString();
        pathologyDiagnosis.setUid(uid);
        pathologyDiagnosisService.save(pathologyDiagnosis);
        
        pathologyDiagnosis=pathologyDiagnosisService.findOne(uid);      
        pathologyDiagnosisMessageScheduler.doSend(pathologyDiagnosis);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
