package com.nestvision.nest.proxy.schedule.appointment;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Appointment;
import com.nestvision.nest.proxy.fhir.service.AppointmentService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppointmentMessageTests {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentMessageScheduler appointmentMessageScheduler;

    @Autowired
    private AppointmentMessageSender appointmentMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Appointment appointment = EntityGenarator.genarate(Appointment.class);
		appointment.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = appointmentMessageSender.createRequestBody(appointment);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        appointment = EntityGenarator.genarateNessaray(Appointment.class);
        templateResult = appointmentMessageSender.createRequestBody(appointment);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Appointment appointment = EntityGenarator.genarate(Appointment.class);	
		String uid = UUID.randomUUID().toString();
		appointment.setUid(uid);  		 		 
        appointmentService.save(appointment);
        
        appointment=appointmentService.findOne(uid);      
        appointmentMessageScheduler.doSend(appointment);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        appointment = EntityGenarator.genarateNessaray(Appointment.class);
        uid = UUID.randomUUID().toString();
        appointment.setUid(uid);
        appointmentService.save(appointment);
        
        appointment=appointmentService.findOne(uid);      
        appointmentMessageScheduler.doSend(appointment);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
