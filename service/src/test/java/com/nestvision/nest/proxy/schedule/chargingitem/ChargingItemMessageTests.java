package com.nestvision.nest.proxy.schedule.chargingitem;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;
import com.nestvision.nest.proxy.fhir.service.ChargingItemService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChargingItemMessageTests {

    @Autowired
    private ChargingItemService chargingItemService;

    @Autowired
    private ChargingItemMessageScheduler chargingItemMessageScheduler;

    @Autowired
    private ChargingItemMessageSender chargingItemMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        ChargingItem chargingItem = EntityGenarator.genarate(ChargingItem.class);
		chargingItem.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = chargingItemMessageSender.createRequestBody(chargingItem);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        chargingItem = EntityGenarator.genarateNessaray(ChargingItem.class);
        templateResult = chargingItemMessageSender.createRequestBody(chargingItem);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		ChargingItem chargingItem = EntityGenarator.genarate(ChargingItem.class);	
		String uid = UUID.randomUUID().toString();
		chargingItem.setUid(uid);  		 		 
        chargingItemService.save(chargingItem);
        
        chargingItem=chargingItemService.findOne(uid);      
        chargingItemMessageScheduler.doSend(chargingItem);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        chargingItem = EntityGenarator.genarateNessaray(ChargingItem.class);
        uid = UUID.randomUUID().toString();
        chargingItem.setUid(uid);
        chargingItemService.save(chargingItem);
        
        chargingItem=chargingItemService.findOne(uid);      
        chargingItemMessageScheduler.doSend(chargingItem);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
