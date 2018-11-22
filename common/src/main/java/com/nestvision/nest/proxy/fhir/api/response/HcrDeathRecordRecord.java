package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;

public class HcrDeathRecordRecord extends FhirResourceRecord {

    public HcrDeathRecordRecord(HcrDeathRecord hcrDeathRecord) {
        super(hcrDeathRecord);
    }
}