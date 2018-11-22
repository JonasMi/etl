package com.nestvision.nest.proxy.schedule.patient;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientMessageTests {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientMessageScheduler patientMessageScheduler;

    @Autowired
    private PatientMessageSender patientMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Patient patient = EntityGenarator.genarate(Patient.class);
		patient.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = patientMessageSender.createRequestBody(patient);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        patient = EntityGenarator.genarateNessaray(Patient.class);
        templateResult = patientMessageSender.createRequestBody(patient);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Patient patient = EntityGenarator.genarate(Patient.class);	
		String uid = UUID.randomUUID().toString();
		patient.setUid(uid);  		 		 
        patientService.save(patient);
        
        patient=patientService.findOne(uid);      
        patientMessageScheduler.doSend(patient);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        patient = EntityGenarator.genarateNessaray(Patient.class);
        uid = UUID.randomUUID().toString();
        patient.setUid(uid);
        patientService.save(patient);
        
        patient=patientService.findOne(uid);      
        patientMessageScheduler.doSend(patient);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
