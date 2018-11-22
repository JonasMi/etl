package com.nestvision.nest.proxy.schedule.outpatientcharges;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientChargesMessageTests {

    @Autowired
    private OutpatientChargesService outpatientChargesService;

    @Autowired
    private OutpatientChargesMessageScheduler outpatientChargesMessageScheduler;

    @Autowired
    private OutpatientChargesMessageSender outpatientChargesMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientCharges outpatientCharges = EntityGenarator.genarate(OutpatientCharges.class);
		outpatientCharges.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientChargesMessageSender.createRequestBody(outpatientCharges);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientCharges = EntityGenarator.genarateNessaray(OutpatientCharges.class);
        templateResult = outpatientChargesMessageSender.createRequestBody(outpatientCharges);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientCharges outpatientCharges = EntityGenarator.genarate(OutpatientCharges.class);	
		String uid = UUID.randomUUID().toString();
		outpatientCharges.setUid(uid);  		 		 
        outpatientChargesService.save(outpatientCharges);
        
        outpatientCharges=outpatientChargesService.findOne(uid);      
        outpatientChargesMessageScheduler.doSend(outpatientCharges);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientCharges = EntityGenarator.genarateNessaray(OutpatientCharges.class);
        uid = UUID.randomUUID().toString();
        outpatientCharges.setUid(uid);
        outpatientChargesService.save(outpatientCharges);
        
        outpatientCharges=outpatientChargesService.findOne(uid);      
        outpatientChargesMessageScheduler.doSend(outpatientCharges);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
