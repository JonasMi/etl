package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;

public class OutpatientSymptomRecord extends FhirResourceRecord {

    public OutpatientSymptomRecord(OutpatientSymptom outpatientSymptom) {
        super(outpatientSymptom);
    }
}