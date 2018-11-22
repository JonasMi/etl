package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Department;

public class DepartmentRecord extends FhirResourceRecord {

    public DepartmentRecord(Department department) {
        super(department);
    }
}