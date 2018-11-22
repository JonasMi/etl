package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Employee;

public class EmployeeRecord extends FhirResourceRecord {

    public EmployeeRecord(Employee employee) {
        super(employee);
    }
}