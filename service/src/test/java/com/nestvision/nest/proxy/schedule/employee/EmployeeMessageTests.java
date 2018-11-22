package com.nestvision.nest.proxy.schedule.employee;

import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.nestvision.nest.proxy.fhir.entity.Employee;
import com.nestvision.nest.proxy.fhir.service.EmployeeService;
import com.nestvision.nest.proxy.test.EntityGenarator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeMessageTests {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMessageScheduler employeeMessageScheduler;

    @Autowired
    private EmployeeMessageSender employeeMessageSender;

    @Test
    public void testTemplateProcess() throws Exception {

        Employee employee = EntityGenarator.genarate(Employee.class);
		employee.setUid(UUID.randomUUID().toString()); 
		 
        String templateResult = employeeMessageSender.createRequestBody(employee);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####完整消息实体请求模板处理结果显示#####");

        employee = EntityGenarator.genarateNessaray(Employee.class);
        templateResult = employeeMessageSender.createRequestBody(employee);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");
        System.out.println(templateResult);
        System.out.println("#####必要消息实体请求模板处理结果显示#####");

    }

    @Test
    public void testSend() throws Exception{
    	
    	//发送完整消息
		Employee employee = EntityGenarator.genarate(Employee.class);	
		String uid = UUID.randomUUID().toString();
		employee.setUid(uid);  		 		 
        employeeService.save(employee);
        
        employee=employeeService.findOne(uid);      
        employeeMessageScheduler.doSend(employee);
        System.out.println("#####完整消息实体请求已经发送完毕#####");
  
        //发送必要消息
        employee = EntityGenarator.genarateNessaray(Employee.class);
        uid = UUID.randomUUID().toString();
        employee.setUid(uid);
        employeeService.save(employee);
        
        employee=employeeService.findOne(uid);      
        employeeMessageScheduler.doSend(employee);
        System.out.println("#####必要消息实体请求已经发送完毕#####");
        
    }
}
