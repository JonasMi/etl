package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;

public class InpatientSymptomRecord extends FhirResourceRecord {

    public InpatientSymptomRecord(InpatientSymptom inpatientSymptom) {
        super(inpatientSymptom);
    }
}