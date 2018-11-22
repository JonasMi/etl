package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;

public class InspectOrderRecord extends FhirResourceRecord {

    public InspectOrderRecord(InspectOrder inspectOrder) {
        super(inspectOrder);
    }
}