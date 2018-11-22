package com.nestvision.nest.proxy.schedule.bed;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Bed;
import com.nestvision.nest.proxy.fhir.service.BedService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BedMessageTests {

    @Autowired
    private BedService bedService;

    @Autowired
    private BedMessageScheduler bedMessageScheduler;

    @Autowired
    private BedMessageSender bedMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Bed bed = EntityGenarator.genarate(Bed.class);
		bed.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = bedMessageSender.createRequestBody(bed);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        bed = EntityGenarator.genarateNessaray(Bed.class);
        templateResult = bedMessageSender.createRequestBody(bed);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Bed bed = EntityGenarator.genarate(Bed.class);	
		String uid = UUID.randomUUID().toString();
		bed.setUid(uid);  		 		 
        bedService.save(bed);
        
        bed=bedService.findOne(uid);      
        bedMessageScheduler.doSend(bed);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        bed = EntityGenarator.genarateNessaray(Bed.class);
        uid = UUID.randomUUID().toString();
        bed.setUid(uid);
        bedService.save(bed);
        
        bed=bedService.findOne(uid);      
        bedMessageScheduler.doSend(bed);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
