package com.nestvision.nest.proxy.schedule.clinictype;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;
import com.nestvision.nest.proxy.fhir.service.ClinictypeService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClinictypeMessageTests {

    @Autowired
    private ClinictypeService clinictypeService;

    @Autowired
    private ClinictypeMessageScheduler clinictypeMessageScheduler;

    @Autowired
    private ClinictypeMessageSender clinictypeMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Clinictype clinictype = EntityGenarator.genarate(Clinictype.class);
		clinictype.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = clinictypeMessageSender.createRequestBody(clinictype);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        clinictype = EntityGenarator.genarateNessaray(Clinictype.class);
        templateResult = clinictypeMessageSender.createRequestBody(clinictype);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Clinictype clinictype = EntityGenarator.genarate(Clinictype.class);	
		String uid = UUID.randomUUID().toString();
		clinictype.setUid(uid);  		 		 
        clinictypeService.save(clinictype);
        
        clinictype=clinictypeService.findOne(uid);      
        clinictypeMessageScheduler.doSend(clinictype);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        clinictype = EntityGenarator.genarateNessaray(Clinictype.class);
        uid = UUID.randomUUID().toString();
        clinictype.setUid(uid);
        clinictypeService.save(clinictype);
        
        clinictype=clinictypeService.findOne(uid);      
        clinictypeMessageScheduler.doSend(clinictype);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
