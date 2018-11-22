package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;

public class TemporaryAdviceRecord extends FhirResourceRecord {

    public TemporaryAdviceRecord(TemporaryAdvice temporaryAdvice) {
        super(temporaryAdvice);
    }
}