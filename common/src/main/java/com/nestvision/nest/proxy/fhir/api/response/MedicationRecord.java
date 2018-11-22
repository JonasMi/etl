package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Medication;

public class MedicationRecord extends FhirResourceRecord {

    public MedicationRecord(Medication medication) {
        super(medication);
    }
}