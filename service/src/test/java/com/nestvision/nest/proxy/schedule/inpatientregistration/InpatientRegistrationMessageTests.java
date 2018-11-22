package com.nestvision.nest.proxy.schedule.inpatientregistration;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.InpatientRegistrationService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InpatientRegistrationMessageTests {

    @Autowired
    private InpatientRegistrationService inpatientRegistrationService;

    @Autowired
    private InpatientRegistrationMessageScheduler inpatientRegistrationMessageScheduler;

    @Autowired
    private InpatientRegistrationMessageSender inpatientRegistrationMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InpatientRegistration inpatientRegistration = EntityGenarator.genarate(InpatientRegistration.class);
		inpatientRegistration.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inpatientRegistrationMessageSender.createRequestBody(inpatientRegistration);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inpatientRegistration = EntityGenarator.genarateNessaray(InpatientRegistration.class);
        templateResult = inpatientRegistrationMessageSender.createRequestBody(inpatientRegistration);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InpatientRegistration inpatientRegistration = EntityGenarator.genarate(InpatientRegistration.class);	
		String uid = UUID.randomUUID().toString();
		inpatientRegistration.setUid(uid);  		 		 
        inpatientRegistrationService.save(inpatientRegistration);
        
        inpatientRegistration=inpatientRegistrationService.findOne(uid);      
        inpatientRegistrationMessageScheduler.doSend(inpatientRegistration);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inpatientRegistration = EntityGenarator.genarateNessaray(InpatientRegistration.class);
        uid = UUID.randomUUID().toString();
        inpatientRegistration.setUid(uid);
        inpatientRegistrationService.save(inpatientRegistration);
        
        inpatientRegistration=inpatientRegistrationService.findOne(uid);      
        inpatientRegistrationMessageScheduler.doSend(inpatientRegistration);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
