package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;

public class AdmissionRecordRecord extends FhirResourceRecord {

    public AdmissionRecordRecord(AdmissionRecord admissionRecord) {
        super(admissionRecord);
    }
}