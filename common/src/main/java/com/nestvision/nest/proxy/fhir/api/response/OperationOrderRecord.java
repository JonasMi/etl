package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;

public class OperationOrderRecord extends FhirResourceRecord {

    public OperationOrderRecord(OperationOrder operationOrder) {
        super(operationOrder);
    }
}