package com.nestvision.nest.proxy.schedule.adulthealthexamination;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;
import com.nestvision.nest.proxy.fhir.service.AdultHealthExaminationService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdultHealthExaminationMessageTests {

    @Autowired
    private AdultHealthExaminationService adultHealthExaminationService;

    @Autowired
    private AdultHealthExaminationMessageScheduler adultHealthExaminationMessageScheduler;

    @Autowired
    private AdultHealthExaminationMessageSender adultHealthExaminationMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        AdultHealthExamination adultHealthExamination = EntityGenarator.genarate(AdultHealthExamination.class);
		adultHealthExamination.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = adultHealthExaminationMessageSender.createRequestBody(adultHealthExamination);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        adultHealthExamination = EntityGenarator.genarateNessaray(AdultHealthExamination.class);
        templateResult = adultHealthExaminationMessageSender.createRequestBody(adultHealthExamination);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		AdultHealthExamination adultHealthExamination = EntityGenarator.genarate(AdultHealthExamination.class);	
		String uid = UUID.randomUUID().toString();
		adultHealthExamination.setUid(uid);  		 		 
        adultHealthExaminationService.save(adultHealthExamination);
        
        adultHealthExamination=adultHealthExaminationService.findOne(uid);      
        adultHealthExaminationMessageScheduler.doSend(adultHealthExamination);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        adultHealthExamination = EntityGenarator.genarateNessaray(AdultHealthExamination.class);
        uid = UUID.randomUUID().toString();
        adultHealthExamination.setUid(uid);
        adultHealthExaminationService.save(adultHealthExamination);
        
        adultHealthExamination=adultHealthExaminationService.findOne(uid);      
        adultHealthExaminationMessageScheduler.doSend(adultHealthExamination);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
