package com.nestvision.nest.proxy.schedule.longtermadvice;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;
import com.nestvision.nest.proxy.fhir.service.LongtermAdviceService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LongtermAdviceMessageTests {

    @Autowired
    private LongtermAdviceService longtermAdviceService;

    @Autowired
    private LongtermAdviceMessageScheduler longtermAdviceMessageScheduler;

    @Autowired
    private LongtermAdviceMessageSender longtermAdviceMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        LongtermAdvice longtermAdvice = EntityGenarator.genarate(LongtermAdvice.class);
		longtermAdvice.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = longtermAdviceMessageSender.createRequestBody(longtermAdvice);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        longtermAdvice = EntityGenarator.genarateNessaray(LongtermAdvice.class);
        templateResult = longtermAdviceMessageSender.createRequestBody(longtermAdvice);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		LongtermAdvice longtermAdvice = EntityGenarator.genarate(LongtermAdvice.class);	
		String uid = UUID.randomUUID().toString();
		longtermAdvice.setUid(uid);  		 		 
        longtermAdviceService.save(longtermAdvice);
        
        longtermAdvice=longtermAdviceService.findOne(uid);      
        longtermAdviceMessageScheduler.doSend(longtermAdvice);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        longtermAdvice = EntityGenarator.genarateNessaray(LongtermAdvice.class);
        uid = UUID.randomUUID().toString();
        longtermAdvice.setUid(uid);
        longtermAdviceService.save(longtermAdvice);
        
        longtermAdvice=longtermAdviceService.findOne(uid);      
        longtermAdviceMessageScheduler.doSend(longtermAdvice);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
