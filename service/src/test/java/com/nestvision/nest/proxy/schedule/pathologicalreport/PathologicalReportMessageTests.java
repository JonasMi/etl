package com.nestvision.nest.proxy.schedule.pathologicalreport;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;
import com.nestvision.nest.proxy.fhir.service.PathologicalReportService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PathologicalReportMessageTests {

    @Autowired
    private PathologicalReportService pathologicalReportService;

    @Autowired
    private PathologicalReportMessageScheduler pathologicalReportMessageScheduler;

    @Autowired
    private PathologicalReportMessageSender pathologicalReportMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        PathologicalReport pathologicalReport = EntityGenarator.genarate(PathologicalReport.class);
		pathologicalReport.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = pathologicalReportMessageSender.createRequestBody(pathologicalReport);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        pathologicalReport = EntityGenarator.genarateNessaray(PathologicalReport.class);
        templateResult = pathologicalReportMessageSender.createRequestBody(pathologicalReport);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		PathologicalReport pathologicalReport = EntityGenarator.genarate(PathologicalReport.class);	
		String uid = UUID.randomUUID().toString();
		pathologicalReport.setUid(uid);  		 		 
        pathologicalReportService.save(pathologicalReport);
        
        pathologicalReport=pathologicalReportService.findOne(uid);      
        pathologicalReportMessageScheduler.doSend(pathologicalReport);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        pathologicalReport = EntityGenarator.genarateNessaray(PathologicalReport.class);
        uid = UUID.randomUUID().toString();
        pathologicalReport.setUid(uid);
        pathologicalReportService.save(pathologicalReport);
        
        pathologicalReport=pathologicalReportService.findOne(uid);      
        pathologicalReportMessageScheduler.doSend(pathologicalReport);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
