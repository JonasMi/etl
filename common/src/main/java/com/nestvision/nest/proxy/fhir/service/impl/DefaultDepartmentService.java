package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.DepartmentRepository;
import com.nestvision.nest.proxy.fhir.entity.Department;
import com.nestvision.nest.proxy.fhir.service.DepartmentService;

@Service
public class DefaultDepartmentService extends AbstractBaseService<Department, String> implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    protected BaseRepository<Department, String> getBaseRepository() {

        return departmentRepository;
    }

}
