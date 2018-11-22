package com.nestvision.nest.proxy.schedule.inpatientcharges;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InpatientChargesMessageTests {

    @Autowired
    private InpatientChargesService inpatientChargesService;

    @Autowired
    private InpatientChargesMessageScheduler inpatientChargesMessageScheduler;

    @Autowired
    private InpatientChargesMessageSender inpatientChargesMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InpatientCharges inpatientCharges = EntityGenarator.genarate(InpatientCharges.class);
		inpatientCharges.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inpatientChargesMessageSender.createRequestBody(inpatientCharges);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inpatientCharges = EntityGenarator.genarateNessaray(InpatientCharges.class);
        templateResult = inpatientChargesMessageSender.createRequestBody(inpatientCharges);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InpatientCharges inpatientCharges = EntityGenarator.genarate(InpatientCharges.class);	
		String uid = UUID.randomUUID().toString();
		inpatientCharges.setUid(uid);  		 		 
        inpatientChargesService.save(inpatientCharges);
        
        inpatientCharges=inpatientChargesService.findOne(uid);      
        inpatientChargesMessageScheduler.doSend(inpatientCharges);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inpatientCharges = EntityGenarator.genarateNessaray(InpatientCharges.class);
        uid = UUID.randomUUID().toString();
        inpatientCharges.setUid(uid);
        inpatientChargesService.save(inpatientCharges);
        
        inpatientCharges=inpatientChargesService.findOne(uid);      
        inpatientChargesMessageScheduler.doSend(inpatientCharges);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
