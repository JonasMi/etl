package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;

public class MedicalRecordRecord extends FhirResourceRecord {

    public MedicalRecordRecord(MedicalRecord medicalRecord) {
        super(medicalRecord);
    }
}