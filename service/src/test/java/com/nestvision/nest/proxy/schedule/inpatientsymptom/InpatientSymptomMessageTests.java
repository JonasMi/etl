package com.nestvision.nest.proxy.schedule.inpatientsymptom;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.InpatientSymptomService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InpatientSymptomMessageTests {

    @Autowired
    private InpatientSymptomService inpatientSymptomService;

    @Autowired
    private InpatientSymptomMessageScheduler inpatientSymptomMessageScheduler;

    @Autowired
    private InpatientSymptomMessageSender inpatientSymptomMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InpatientSymptom inpatientSymptom = EntityGenarator.genarate(InpatientSymptom.class);
		inpatientSymptom.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inpatientSymptomMessageSender.createRequestBody(inpatientSymptom);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inpatientSymptom = EntityGenarator.genarateNessaray(InpatientSymptom.class);
        templateResult = inpatientSymptomMessageSender.createRequestBody(inpatientSymptom);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InpatientSymptom inpatientSymptom = EntityGenarator.genarate(InpatientSymptom.class);	
		String uid = UUID.randomUUID().toString();
		inpatientSymptom.setUid(uid);  		 		 
        inpatientSymptomService.save(inpatientSymptom);
        
        inpatientSymptom=inpatientSymptomService.findOne(uid);      
        inpatientSymptomMessageScheduler.doSend(inpatientSymptom);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inpatientSymptom = EntityGenarator.genarateNessaray(InpatientSymptom.class);
        uid = UUID.randomUUID().toString();
        inpatientSymptom.setUid(uid);
        inpatientSymptomService.save(inpatientSymptom);
        
        inpatientSymptom=inpatientSymptomService.findOne(uid);      
        inpatientSymptomMessageScheduler.doSend(inpatientSymptom);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
