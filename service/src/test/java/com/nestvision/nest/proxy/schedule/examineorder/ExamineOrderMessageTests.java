package com.nestvision.nest.proxy.schedule.examineorder;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;
import com.nestvision.nest.proxy.fhir.service.ExamineOrderService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamineOrderMessageTests {

    @Autowired
    private ExamineOrderService examineOrderService;

    @Autowired
    private ExamineOrderMessageScheduler examineOrderMessageScheduler;

    @Autowired
    private ExamineOrderMessageSender examineOrderMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        ExamineOrder examineOrder = EntityGenarator.genarate(ExamineOrder.class);
		examineOrder.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = examineOrderMessageSender.createRequestBody(examineOrder);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        examineOrder = EntityGenarator.genarateNessaray(ExamineOrder.class);
        templateResult = examineOrderMessageSender.createRequestBody(examineOrder);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		ExamineOrder examineOrder = EntityGenarator.genarate(ExamineOrder.class);	
		String uid = UUID.randomUUID().toString();
		examineOrder.setUid(uid);  		 		 
        examineOrderService.save(examineOrder);
        
        examineOrder=examineOrderService.findOne(uid);      
        examineOrderMessageScheduler.doSend(examineOrder);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        examineOrder = EntityGenarator.genarateNessaray(ExamineOrder.class);
        uid = UUID.randomUUID().toString();
        examineOrder.setUid(uid);
        examineOrderService.save(examineOrder);
        
        examineOrder=examineOrderService.findOne(uid);      
        examineOrderMessageScheduler.doSend(examineOrder);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
