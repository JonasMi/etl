package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;

public class OutpatientRegistrationRecord extends FhirResourceRecord {

    public OutpatientRegistrationRecord(OutpatientRegistration outpatientRegistration) {
        super(outpatientRegistration);
    }
}