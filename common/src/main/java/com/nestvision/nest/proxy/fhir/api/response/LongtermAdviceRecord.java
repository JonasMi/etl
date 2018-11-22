package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;

public class LongtermAdviceRecord extends FhirResourceRecord {

    public LongtermAdviceRecord(LongtermAdvice longtermAdvice) {
        super(longtermAdvice);
    }
}