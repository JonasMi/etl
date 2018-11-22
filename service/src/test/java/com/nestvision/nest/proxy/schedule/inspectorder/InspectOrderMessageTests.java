package com.nestvision.nest.proxy.schedule.inspectorder;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;
import com.nestvision.nest.proxy.fhir.service.InspectOrderService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InspectOrderMessageTests {

    @Autowired
    private InspectOrderService inspectOrderService;

    @Autowired
    private InspectOrderMessageScheduler inspectOrderMessageScheduler;

    @Autowired
    private InspectOrderMessageSender inspectOrderMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InspectOrder inspectOrder = EntityGenarator.genarate(InspectOrder.class);
		inspectOrder.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inspectOrderMessageSender.createRequestBody(inspectOrder);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inspectOrder = EntityGenarator.genarateNessaray(InspectOrder.class);
        templateResult = inspectOrderMessageSender.createRequestBody(inspectOrder);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InspectOrder inspectOrder = EntityGenarator.genarate(InspectOrder.class);	
		String uid = UUID.randomUUID().toString();
		inspectOrder.setUid(uid);  		 		 
        inspectOrderService.save(inspectOrder);
        
        inspectOrder=inspectOrderService.findOne(uid);      
        inspectOrderMessageScheduler.doSend(inspectOrder);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inspectOrder = EntityGenarator.genarateNessaray(InspectOrder.class);
        uid = UUID.randomUUID().toString();
        inspectOrder.setUid(uid);
        inspectOrderService.save(inspectOrder);
        
        inspectOrder=inspectOrderService.findOne(uid);      
        inspectOrderMessageScheduler.doSend(inspectOrder);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
