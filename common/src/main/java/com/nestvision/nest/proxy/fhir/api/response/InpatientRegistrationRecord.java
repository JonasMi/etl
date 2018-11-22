package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;

public class InpatientRegistrationRecord extends FhirResourceRecord {

    public InpatientRegistrationRecord(InpatientRegistration inpatientRegistration) {
        super(inpatientRegistration);
    }
}