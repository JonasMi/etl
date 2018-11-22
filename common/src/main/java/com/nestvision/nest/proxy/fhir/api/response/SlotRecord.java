package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Slot;

public class SlotRecord extends FhirResourceRecord {

    public SlotRecord(Slot slot) {
        super(slot);
    }
}