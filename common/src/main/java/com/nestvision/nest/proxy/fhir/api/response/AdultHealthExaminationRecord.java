package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;

public class AdultHealthExaminationRecord extends FhirResourceRecord {

    public AdultHealthExaminationRecord(AdultHealthExamination adultHealthExamination) {
        super(adultHealthExamination);
    }
}