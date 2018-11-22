package com.nestvision.nest.proxy.schedule.inspectreport;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;
import com.nestvision.nest.proxy.fhir.service.InspectReportService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InspectReportMessageTests {

    @Autowired
    private InspectReportService inspectReportService;

    @Autowired
    private InspectReportMessageScheduler inspectReportMessageScheduler;

    @Autowired
    private InspectReportMessageSender inspectReportMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        InspectReport inspectReport = EntityGenarator.genarate(InspectReport.class);
		inspectReport.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = inspectReportMessageSender.createRequestBody(inspectReport);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        inspectReport = EntityGenarator.genarateNessaray(InspectReport.class);
        templateResult = inspectReportMessageSender.createRequestBody(inspectReport);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		InspectReport inspectReport = EntityGenarator.genarate(InspectReport.class);	
		String uid = UUID.randomUUID().toString();
		inspectReport.setUid(uid);  		 		 
        inspectReportService.save(inspectReport);
        
        inspectReport=inspectReportService.findOne(uid);      
        inspectReportMessageScheduler.doSend(inspectReport);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        inspectReport = EntityGenarator.genarateNessaray(InspectReport.class);
        uid = UUID.randomUUID().toString();
        inspectReport.setUid(uid);
        inspectReportService.save(inspectReport);
        
        inspectReport=inspectReportService.findOne(uid);      
        inspectReportMessageScheduler.doSend(inspectReport);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
