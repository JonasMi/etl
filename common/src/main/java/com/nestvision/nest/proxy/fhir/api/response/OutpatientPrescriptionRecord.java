package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;

public class OutpatientPrescriptionRecord extends FhirResourceRecord {

    public OutpatientPrescriptionRecord(OutpatientPrescription outpatientPrescription) {
        super(outpatientPrescription);
    }
}