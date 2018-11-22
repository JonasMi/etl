package com.nestvision.nest.proxy.schedule.dischargesummary;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;
import com.nestvision.nest.proxy.fhir.service.DischargeSummaryService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DischargeSummaryMessageTests {

    @Autowired
    private DischargeSummaryService dischargeSummaryService;

    @Autowired
    private DischargeSummaryMessageScheduler dischargeSummaryMessageScheduler;

    @Autowired
    private DischargeSummaryMessageSender dischargeSummaryMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        DischargeSummary dischargeSummary = EntityGenarator.genarate(DischargeSummary.class);
		dischargeSummary.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = dischargeSummaryMessageSender.createRequestBody(dischargeSummary);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        dischargeSummary = EntityGenarator.genarateNessaray(DischargeSummary.class);
        templateResult = dischargeSummaryMessageSender.createRequestBody(dischargeSummary);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		DischargeSummary dischargeSummary = EntityGenarator.genarate(DischargeSummary.class);	
		String uid = UUID.randomUUID().toString();
		dischargeSummary.setUid(uid);  		 		 
        dischargeSummaryService.save(dischargeSummary);
        
        dischargeSummary=dischargeSummaryService.findOne(uid);      
        dischargeSummaryMessageScheduler.doSend(dischargeSummary);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        dischargeSummary = EntityGenarator.genarateNessaray(DischargeSummary.class);
        uid = UUID.randomUUID().toString();
        dischargeSummary.setUid(uid);
        dischargeSummaryService.save(dischargeSummary);
        
        dischargeSummary=dischargeSummaryService.findOne(uid);      
        dischargeSummaryMessageScheduler.doSend(dischargeSummary);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
