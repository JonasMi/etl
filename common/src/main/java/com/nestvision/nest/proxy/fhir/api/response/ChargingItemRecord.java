package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;

public class ChargingItemRecord extends FhirResourceRecord {

    public ChargingItemRecord(ChargingItem chargingItem) {
        super(chargingItem);
    }
}