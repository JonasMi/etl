package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;

public class OutpatientChargesRecord extends FhirResourceRecord {

    public OutpatientChargesRecord(OutpatientCharges outpatientCharges) {
        super(outpatientCharges);
    }
}