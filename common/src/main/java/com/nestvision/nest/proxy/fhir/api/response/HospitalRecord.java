package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Hospital;

public class HospitalRecord extends FhirResourceRecord {

    public HospitalRecord(Hospital hospital) {
        super(hospital);
    }
}