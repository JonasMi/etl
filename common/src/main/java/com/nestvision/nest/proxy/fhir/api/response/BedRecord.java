package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.Bed;

public class BedRecord extends FhirResourceRecord {

    public BedRecord(Bed bed) {
        super(bed);
    }
}