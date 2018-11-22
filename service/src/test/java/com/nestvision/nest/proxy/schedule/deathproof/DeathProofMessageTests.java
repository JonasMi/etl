package com.nestvision.nest.proxy.schedule.deathproof;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;
import com.nestvision.nest.proxy.fhir.service.DeathProofService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeathProofMessageTests {

    @Autowired
    private DeathProofService deathProofService;

    @Autowired
    private DeathProofMessageScheduler deathProofMessageScheduler;

    @Autowired
    private DeathProofMessageSender deathProofMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        DeathProof deathProof = EntityGenarator.genarate(DeathProof.class);
		deathProof.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = deathProofMessageSender.createRequestBody(deathProof);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        deathProof = EntityGenarator.genarateNessaray(DeathProof.class);
        templateResult = deathProofMessageSender.createRequestBody(deathProof);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		DeathProof deathProof = EntityGenarator.genarate(DeathProof.class);	
		String uid = UUID.randomUUID().toString();
		deathProof.setUid(uid);  		 		 
        deathProofService.save(deathProof);
        
        deathProof=deathProofService.findOne(uid);      
        deathProofMessageScheduler.doSend(deathProof);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        deathProof = EntityGenarator.genarateNessaray(DeathProof.class);
        uid = UUID.randomUUID().toString();
        deathProof.setUid(uid);
        deathProofService.save(deathProof);
        
        deathProof=deathProofService.findOne(uid);      
        deathProofMessageScheduler.doSend(deathProof);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
