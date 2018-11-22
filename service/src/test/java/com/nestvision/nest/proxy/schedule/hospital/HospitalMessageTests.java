package com.nestvision.nest.proxy.schedule.hospital;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Hospital;
import com.nestvision.nest.proxy.fhir.service.HospitalService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalMessageTests {

    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private HospitalMessageScheduler hospitalMessageScheduler;

    @Autowired
    private HospitalMessageSender hospitalMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Hospital hospital = EntityGenarator.genarate(Hospital.class);
		hospital.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = hospitalMessageSender.createRequestBody(hospital);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        hospital = EntityGenarator.genarateNessaray(Hospital.class);
        templateResult = hospitalMessageSender.createRequestBody(hospital);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Hospital hospital = EntityGenarator.genarate(Hospital.class);	
		String uid = UUID.randomUUID().toString();
		hospital.setUid(uid);  		 		 
        hospitalService.save(hospital);
        
        hospital=hospitalService.findOne(uid);      
        hospitalMessageScheduler.doSend(hospital);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        hospital = EntityGenarator.genarateNessaray(Hospital.class);
        uid = UUID.randomUUID().toString();
        hospital.setUid(uid);
        hospitalService.save(hospital);
        
        hospital=hospitalService.findOne(uid);      
        hospitalMessageScheduler.doSend(hospital);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
