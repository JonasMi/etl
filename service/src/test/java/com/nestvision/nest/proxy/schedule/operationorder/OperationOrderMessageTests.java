package com.nestvision.nest.proxy.schedule.operationorder;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;
import com.nestvision.nest.proxy.fhir.service.OperationOrderService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationOrderMessageTests {

    @Autowired
    private OperationOrderService operationOrderService;

    @Autowired
    private OperationOrderMessageScheduler operationOrderMessageScheduler;

    @Autowired
    private OperationOrderMessageSender operationOrderMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OperationOrder operationOrder = EntityGenarator.genarate(OperationOrder.class);
		operationOrder.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = operationOrderMessageSender.createRequestBody(operationOrder);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        operationOrder = EntityGenarator.genarateNessaray(OperationOrder.class);
        templateResult = operationOrderMessageSender.createRequestBody(operationOrder);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OperationOrder operationOrder = EntityGenarator.genarate(OperationOrder.class);	
		String uid = UUID.randomUUID().toString();
		operationOrder.setUid(uid);  		 		 
        operationOrderService.save(operationOrder);
        
        operationOrder=operationOrderService.findOne(uid);      
        operationOrderMessageScheduler.doSend(operationOrder);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        operationOrder = EntityGenarator.genarateNessaray(OperationOrder.class);
        uid = UUID.randomUUID().toString();
        operationOrder.setUid(uid);
        operationOrderService.save(operationOrder);
        
        operationOrder=operationOrderService.findOne(uid);      
        operationOrderMessageScheduler.doSend(operationOrder);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
