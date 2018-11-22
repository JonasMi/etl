package com.nestvision.nest.proxy.schedule.medication;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Medication;
import com.nestvision.nest.proxy.fhir.service.MedicationService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicationMessageTests {

    @Autowired
    private MedicationService medicationService;

    @Autowired
    private MedicationMessageScheduler medicationMessageScheduler;

    @Autowired
    private MedicationMessageSender medicationMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Medication medication = EntityGenarator.genarate(Medication.class);
		medication.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = medicationMessageSender.createRequestBody(medication);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        medication = EntityGenarator.genarateNessaray(Medication.class);
        templateResult = medicationMessageSender.createRequestBody(medication);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Medication medication = EntityGenarator.genarate(Medication.class);	
		String uid = UUID.randomUUID().toString();
		medication.setUid(uid);  		 		 
        medicationService.save(medication);
        
        medication=medicationService.findOne(uid);      
        medicationMessageScheduler.doSend(medication);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        medication = EntityGenarator.genarateNessaray(Medication.class);
        uid = UUID.randomUUID().toString();
        medication.setUid(uid);
        medicationService.save(medication);
        
        medication=medicationService.findOne(uid);      
        medicationMessageScheduler.doSend(medication);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
