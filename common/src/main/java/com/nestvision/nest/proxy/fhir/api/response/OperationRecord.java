package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Operation;

public class OperationRecord extends FhirResourceRecord {

    public OperationRecord(Operation operation) {
        super(operation);
    }
}