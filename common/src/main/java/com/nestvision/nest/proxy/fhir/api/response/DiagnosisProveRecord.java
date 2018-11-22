package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;

public class DiagnosisProveRecord extends FhirResourceRecord {

    public DiagnosisProveRecord(DiagnosisProve diagnosisProve) {
        super(diagnosisProve);
    }
}