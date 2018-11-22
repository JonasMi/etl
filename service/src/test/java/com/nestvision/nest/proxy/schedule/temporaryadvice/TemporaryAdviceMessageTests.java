package com.nestvision.nest.proxy.schedule.temporaryadvice;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;
import com.nestvision.nest.proxy.fhir.service.TemporaryAdviceService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemporaryAdviceMessageTests {

    @Autowired
    private TemporaryAdviceService temporaryAdviceService;

    @Autowired
    private TemporaryAdviceMessageScheduler temporaryAdviceMessageScheduler;

    @Autowired
    private TemporaryAdviceMessageSender temporaryAdviceMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        TemporaryAdvice temporaryAdvice = EntityGenarator.genarate(TemporaryAdvice.class);
		temporaryAdvice.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = temporaryAdviceMessageSender.createRequestBody(temporaryAdvice);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        temporaryAdvice = EntityGenarator.genarateNessaray(TemporaryAdvice.class);
        templateResult = temporaryAdviceMessageSender.createRequestBody(temporaryAdvice);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		TemporaryAdvice temporaryAdvice = EntityGenarator.genarate(TemporaryAdvice.class);	
		String uid = UUID.randomUUID().toString();
		temporaryAdvice.setUid(uid);  		 		 
        temporaryAdviceService.save(temporaryAdvice);
        
        temporaryAdvice=temporaryAdviceService.findOne(uid);      
        temporaryAdviceMessageScheduler.doSend(temporaryAdvice);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        temporaryAdvice = EntityGenarator.genarateNessaray(TemporaryAdvice.class);
        uid = UUID.randomUUID().toString();
        temporaryAdvice.setUid(uid);
        temporaryAdviceService.save(temporaryAdvice);
        
        temporaryAdvice=temporaryAdviceService.findOne(uid);      
        temporaryAdviceMessageScheduler.doSend(temporaryAdvice);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
