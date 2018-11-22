package com.nestvision.nest.proxy.schedule.slot;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Slot;
import com.nestvision.nest.proxy.fhir.service.SlotService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SlotMessageTests {

    @Autowired
    private SlotService slotService;

    @Autowired
    private SlotMessageScheduler slotMessageScheduler;

    @Autowired
    private SlotMessageSender slotMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Slot slot = EntityGenarator.genarate(Slot.class);
		slot.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = slotMessageSender.createRequestBody(slot);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        slot = EntityGenarator.genarateNessaray(Slot.class);
        templateResult = slotMessageSender.createRequestBody(slot);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Slot slot = EntityGenarator.genarate(Slot.class);	
		String uid = UUID.randomUUID().toString();
		slot.setUid(uid);  		 		 
        slotService.save(slot);
        
        slot=slotService.findOne(uid);      
        slotMessageScheduler.doSend(slot);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        slot = EntityGenarator.genarateNessaray(Slot.class);
        uid = UUID.randomUUID().toString();
        slot.setUid(uid);
        slotService.save(slot);
        
        slot=slotService.findOne(uid);      
        slotMessageScheduler.doSend(slot);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
