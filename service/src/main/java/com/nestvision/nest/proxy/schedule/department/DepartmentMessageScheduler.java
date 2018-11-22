package com.nestvision.nest.proxy.schedule.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Department;
import com.nestvision.nest.proxy.fhir.service.DepartmentService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DepartmentMessageScheduler extends AbstractMessageScheduler<Department> {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMessageSender departmentMessageSender;
    
	@Autowired
    private DepartmentMessageValidator departmentMessageValidator;
    
    @Override
    protected Page<Department> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Department> query = new FhirResourceQuery<>();
        return departmentService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Department department) {

        log.debug("发送消息[{}-{}],CN={}", department.getClass().getSimpleName(),department.getUid(), department.getUpHospital());
        departmentMessageSender.send(department);

    }
    @Override
    protected MessageValidateResult doValidate(Department department) {

        return departmentMessageValidator.validate(department);
    }

    @Override
    protected void doDelete(Department department) {
        departmentService.delete(department);

    }

}
