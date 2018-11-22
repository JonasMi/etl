package com.nestvision.nest.proxy.schedule.department;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Department;
import com.nestvision.nest.proxy.fhir.service.DepartmentService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMessageTests {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMessageScheduler departmentMessageScheduler;

    @Autowired
    private DepartmentMessageSender departmentMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Department department = EntityGenarator.genarate(Department.class);
		department.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = departmentMessageSender.createRequestBody(department);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        department = EntityGenarator.genarateNessaray(Department.class);
        templateResult = departmentMessageSender.createRequestBody(department);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Department department = EntityGenarator.genarate(Department.class);	
		String uid = UUID.randomUUID().toString();
		department.setUid(uid);  		 		 
        departmentService.save(department);
        
        department=departmentService.findOne(uid);      
        departmentMessageScheduler.doSend(department);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        department = EntityGenarator.genarateNessaray(Department.class);
        uid = UUID.randomUUID().toString();
        department.setUid(uid);
        departmentService.save(department);
        
        department=departmentService.findOne(uid);      
        departmentMessageScheduler.doSend(department);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
