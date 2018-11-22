package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Patient;

public class PatientRecord extends FhirResourceRecord {

    public PatientRecord(Patient patient) {
        super(patient);
    }
}