package com.nestvision.nest.proxy.schedule.diagnosisprove;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;
import com.nestvision.nest.proxy.fhir.service.DiagnosisProveService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiagnosisProveMessageTests {

    @Autowired
    private DiagnosisProveService diagnosisProveService;

    @Autowired
    private DiagnosisProveMessageScheduler diagnosisProveMessageScheduler;

    @Autowired
    private DiagnosisProveMessageSender diagnosisProveMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        DiagnosisProve diagnosisProve = EntityGenarator.genarate(DiagnosisProve.class);
		diagnosisProve.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = diagnosisProveMessageSender.createRequestBody(diagnosisProve);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        diagnosisProve = EntityGenarator.genarateNessaray(DiagnosisProve.class);
        templateResult = diagnosisProveMessageSender.createRequestBody(diagnosisProve);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		DiagnosisProve diagnosisProve = EntityGenarator.genarate(DiagnosisProve.class);	
		String uid = UUID.randomUUID().toString();
		diagnosisProve.setUid(uid);  		 		 
        diagnosisProveService.save(diagnosisProve);
        
        diagnosisProve=diagnosisProveService.findOne(uid);      
        diagnosisProveMessageScheduler.doSend(diagnosisProve);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        diagnosisProve = EntityGenarator.genarateNessaray(DiagnosisProve.class);
        uid = UUID.randomUUID().toString();
        diagnosisProve.setUid(uid);
        diagnosisProveService.save(diagnosisProve);
        
        diagnosisProve=diagnosisProveService.findOne(uid);      
        diagnosisProveMessageScheduler.doSend(diagnosisProve);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
