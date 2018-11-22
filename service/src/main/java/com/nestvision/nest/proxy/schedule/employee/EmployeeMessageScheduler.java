package com.nestvision.nest.proxy.schedule.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Employee;
import com.nestvision.nest.proxy.fhir.service.EmployeeService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeMessageScheduler extends AbstractMessageScheduler<Employee> {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeMessageSender employeeMessageSender;
    
	@Autowired
    private EmployeeMessageValidator employeeMessageValidator;
    
    @Override
    protected Page<Employee> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Employee> query = new FhirResourceQuery<>();
        return employeeService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Employee employee) {

        log.debug("发送消息[{}-{}],CN={}", employee.getClass().getSimpleName(),employee.getUid(), employee.getUpHospital());
        employeeMessageSender.send(employee);

    }
    @Override
    protected MessageValidateResult doValidate(Employee employee) {

        return employeeMessageValidator.validate(employee);
    }

    @Override
    protected void doDelete(Employee employee) {
        employeeService.delete(employee);

    }

}
