package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;

public class InspectReportRecord extends FhirResourceRecord {

    public InspectReportRecord(InspectReport inspectReport) {
        super(inspectReport);
    }
}