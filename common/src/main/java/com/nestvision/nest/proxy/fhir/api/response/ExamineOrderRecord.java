package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;

public class ExamineOrderRecord extends FhirResourceRecord {

    public ExamineOrderRecord(ExamineOrder examineOrder) {
        super(examineOrder);
    }
}