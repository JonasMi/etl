package com.nestvision.nest.proxy.schedule.examinereport;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;
import com.nestvision.nest.proxy.fhir.service.ExamineReportService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamineReportMessageTests {

    @Autowired
    private ExamineReportService examineReportService;

    @Autowired
    private ExamineReportMessageScheduler examineReportMessageScheduler;

    @Autowired
    private ExamineReportMessageSender examineReportMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        ExamineReport examineReport = EntityGenarator.genarate(ExamineReport.class);
		examineReport.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = examineReportMessageSender.createRequestBody(examineReport);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        examineReport = EntityGenarator.genarateNessaray(ExamineReport.class);
        templateResult = examineReportMessageSender.createRequestBody(examineReport);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		ExamineReport examineReport = EntityGenarator.genarate(ExamineReport.class);	
		String uid = UUID.randomUUID().toString();
		examineReport.setUid(uid);  		 		 
        examineReportService.save(examineReport);
        
        examineReport=examineReportService.findOne(uid);      
        examineReportMessageScheduler.doSend(examineReport);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        examineReport = EntityGenarator.genarateNessaray(ExamineReport.class);
        uid = UUID.randomUUID().toString();
        examineReport.setUid(uid);
        examineReportService.save(examineReport);
        
        examineReport=examineReportService.findOne(uid);      
        examineReportMessageScheduler.doSend(examineReport);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
