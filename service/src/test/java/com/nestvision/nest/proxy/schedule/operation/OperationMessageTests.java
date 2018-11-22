package com.nestvision.nest.proxy.schedule.operation;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Operation;
import com.nestvision.nest.proxy.fhir.service.OperationService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationMessageTests {

    @Autowired
    private OperationService operationService;

    @Autowired
    private OperationMessageScheduler operationMessageScheduler;

    @Autowired
    private OperationMessageSender operationMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Operation operation = EntityGenarator.genarate(Operation.class);
		operation.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = operationMessageSender.createRequestBody(operation);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        operation = EntityGenarator.genarateNessaray(Operation.class);
        templateResult = operationMessageSender.createRequestBody(operation);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Operation operation = EntityGenarator.genarate(Operation.class);	
		String uid = UUID.randomUUID().toString();
		operation.setUid(uid);  		 		 
        operationService.save(operation);
        
        operation=operationService.findOne(uid);      
        operationMessageScheduler.doSend(operation);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        operation = EntityGenarator.genarateNessaray(Operation.class);
        uid = UUID.randomUUID().toString();
        operation.setUid(uid);
        operationService.save(operation);
        
        operation=operationService.findOne(uid);      
        operationMessageScheduler.doSend(operation);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
