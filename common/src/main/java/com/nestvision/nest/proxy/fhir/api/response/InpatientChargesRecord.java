package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;

public class InpatientChargesRecord extends FhirResourceRecord {

    public InpatientChargesRecord(InpatientCharges inpatientCharges) {
        super(inpatientCharges);
    }
}