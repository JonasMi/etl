package com.nestvision.nest.proxy.schedule.ininjuryexternalcause;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InInjuryExternalCause;
import com.nestvision.nest.proxy.fhir.service.InInjuryExternalCauseService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InInjuryExternalCauseMessageTests {

    @Autowired
    private InInjuryExternalCauseService inInjuryExternalCauseService;

    @Autowired
    private InInjuryExternalCauseMessageScheduler inInjuryExternalCauseMessageScheduler;

    @Autowired
    private InInjuryExternalCauseMessageSender inInjuryExternalCauseMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InInjuryExternalCause inInjuryExternalCause = EntityGenarator.genarate(InInjuryExternalCause.class);
		inInjuryExternalCause.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inInjuryExternalCauseMessageSender.createRequestBody(inInjuryExternalCause);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inInjuryExternalCause = EntityGenarator.genarateNessaray(InInjuryExternalCause.class);
        templateResult = inInjuryExternalCauseMessageSender.createRequestBody(inInjuryExternalCause);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InInjuryExternalCause inInjuryExternalCause = EntityGenarator.genarate(InInjuryExternalCause.class);	
		String uid = UUID.randomUUID().toString();
		inInjuryExternalCause.setUid(uid);  		 		 
        inInjuryExternalCauseService.save(inInjuryExternalCause);
        
        inInjuryExternalCause=inInjuryExternalCauseService.findOne(uid);      
        inInjuryExternalCauseMessageScheduler.doSend(inInjuryExternalCause);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inInjuryExternalCause = EntityGenarator.genarateNessaray(InInjuryExternalCause.class);
        uid = UUID.randomUUID().toString();
        inInjuryExternalCause.setUid(uid);
        inInjuryExternalCauseService.save(inInjuryExternalCause);
        
        inInjuryExternalCause=inInjuryExternalCauseService.findOne(uid);      
        inInjuryExternalCauseMessageScheduler.doSend(inInjuryExternalCause);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
