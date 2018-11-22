package com.nestvision.nest.proxy.schedule.outpatientregistration;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.OutpatientRegistrationService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientRegistrationMessageTests {

    @Autowired
    private OutpatientRegistrationService outpatientRegistrationService;

    @Autowired
    private OutpatientRegistrationMessageScheduler outpatientRegistrationMessageScheduler;

    @Autowired
    private OutpatientRegistrationMessageSender outpatientRegistrationMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientRegistration outpatientRegistration = EntityGenarator.genarate(OutpatientRegistration.class);
		outpatientRegistration.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientRegistrationMessageSender.createRequestBody(outpatientRegistration);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientRegistration = EntityGenarator.genarateNessaray(OutpatientRegistration.class);
        templateResult = outpatientRegistrationMessageSender.createRequestBody(outpatientRegistration);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientRegistration outpatientRegistration = EntityGenarator.genarate(OutpatientRegistration.class);	
		String uid = UUID.randomUUID().toString();
		outpatientRegistration.setUid(uid);  		 		 
        outpatientRegistrationService.save(outpatientRegistration);
        
        outpatientRegistration=outpatientRegistrationService.findOne(uid);      
        outpatientRegistrationMessageScheduler.doSend(outpatientRegistration);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientRegistration = EntityGenarator.genarateNessaray(OutpatientRegistration.class);
        uid = UUID.randomUUID().toString();
        outpatientRegistration.setUid(uid);
        outpatientRegistrationService.save(outpatientRegistration);
        
        outpatientRegistration=outpatientRegistrationService.findOne(uid);      
        outpatientRegistrationMessageScheduler.doSend(outpatientRegistration);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
