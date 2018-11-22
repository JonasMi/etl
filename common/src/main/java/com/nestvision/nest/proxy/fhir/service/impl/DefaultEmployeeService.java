package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.EmployeeRepository;
import com.nestvision.nest.proxy.fhir.entity.Employee;
import com.nestvision.nest.proxy.fhir.service.EmployeeService;

@Service
public class DefaultEmployeeService extends AbstractBaseService<Employee, String> implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    protected BaseRepository<Employee, String> getBaseRepository() {

        return employeeRepository;
    }

}
