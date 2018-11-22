package com.nestvision.nest.proxy.schedule.outpatientprescription;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutpatientPrescriptionMessageTests {

    @Autowired
    private OutpatientPrescriptionService outpatientPrescriptionService;

    @Autowired
    private OutpatientPrescriptionMessageScheduler outpatientPrescriptionMessageScheduler;

    @Autowired
    private OutpatientPrescriptionMessageSender outpatientPrescriptionMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        OutpatientPrescription outpatientPrescription = EntityGenarator.genarate(OutpatientPrescription.class);
		outpatientPrescription.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = outpatientPrescriptionMessageSender.createRequestBody(outpatientPrescription);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        outpatientPrescription = EntityGenarator.genarateNessaray(OutpatientPrescription.class);
        templateResult = outpatientPrescriptionMessageSender.createRequestBody(outpatientPrescription);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		OutpatientPrescription outpatientPrescription = EntityGenarator.genarate(OutpatientPrescription.class);	
		String uid = UUID.randomUUID().toString();
		outpatientPrescription.setUid(uid);  		 		 
        outpatientPrescriptionService.save(outpatientPrescription);
        
        outpatientPrescription=outpatientPrescriptionService.findOne(uid);      
        outpatientPrescriptionMessageScheduler.doSend(outpatientPrescription);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        outpatientPrescription = EntityGenarator.genarateNessaray(OutpatientPrescription.class);
        uid = UUID.randomUUID().toString();
        outpatientPrescription.setUid(uid);
        outpatientPrescriptionService.save(outpatientPrescription);
        
        outpatientPrescription=outpatientPrescriptionService.findOne(uid);      
        outpatientPrescriptionMessageScheduler.doSend(outpatientPrescription);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
