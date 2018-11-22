package com.nestvision.nest.proxy.schedule.hcrdeathrecord;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;
import com.nestvision.nest.proxy.fhir.service.HcrDeathRecordService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HcrDeathRecordMessageTests {

    @Autowired
    private HcrDeathRecordService hcrDeathRecordService;

    @Autowired
    private HcrDeathRecordMessageScheduler hcrDeathRecordMessageScheduler;

    @Autowired
    private HcrDeathRecordMessageSender hcrDeathRecordMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        HcrDeathRecord hcrDeathRecord = EntityGenarator.genarate(HcrDeathRecord.class);
		hcrDeathRecord.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = hcrDeathRecordMessageSender.createRequestBody(hcrDeathRecord);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        hcrDeathRecord = EntityGenarator.genarateNessaray(HcrDeathRecord.class);
        templateResult = hcrDeathRecordMessageSender.createRequestBody(hcrDeathRecord);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		HcrDeathRecord hcrDeathRecord = EntityGenarator.genarate(HcrDeathRecord.class);	
		String uid = UUID.randomUUID().toString();
		hcrDeathRecord.setUid(uid);  		 		 
        hcrDeathRecordService.save(hcrDeathRecord);
        
        hcrDeathRecord=hcrDeathRecordService.findOne(uid);      
        hcrDeathRecordMessageScheduler.doSend(hcrDeathRecord);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        hcrDeathRecord = EntityGenarator.genarateNessaray(HcrDeathRecord.class);
        uid = UUID.randomUUID().toString();
        hcrDeathRecord.setUid(uid);
        hcrDeathRecordService.save(hcrDeathRecord);
        
        hcrDeathRecord=hcrDeathRecordService.findOne(uid);      
        hcrDeathRecordMessageScheduler.doSend(hcrDeathRecord);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
