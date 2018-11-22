package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;

public class DischargeSummaryRecord extends FhirResourceRecord {

    public DischargeSummaryRecord(DischargeSummary dischargeSummary) {
        super(dischargeSummary);
    }
}