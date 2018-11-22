package com.nestvision.nest.proxy.schedule.schedule;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Schedule;
import com.nestvision.nest.proxy.fhir.service.ScheduleService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduleMessageTests {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private ScheduleMessageScheduler scheduleMessageScheduler;

    @Autowired
    private ScheduleMessageSender scheduleMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Schedule schedule = EntityGenarator.genarate(Schedule.class);
		schedule.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = scheduleMessageSender.createRequestBody(schedule);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        schedule = EntityGenarator.genarateNessaray(Schedule.class);
        templateResult = scheduleMessageSender.createRequestBody(schedule);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Schedule schedule = EntityGenarator.genarate(Schedule.class);	
		String uid = UUID.randomUUID().toString();
		schedule.setUid(uid);  		 		 
        scheduleService.save(schedule);
        
        schedule=scheduleService.findOne(uid);      
        scheduleMessageScheduler.doSend(schedule);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        schedule = EntityGenarator.genarateNessaray(Schedule.class);
        uid = UUID.randomUUID().toString();
        schedule.setUid(uid);
        scheduleService.save(schedule);
        
        schedule=scheduleService.findOne(uid);      
        scheduleMessageScheduler.doSend(schedule);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
