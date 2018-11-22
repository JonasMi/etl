package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;

public class ExamineReportRecord extends FhirResourceRecord {

    public ExamineReportRecord(ExamineReport examineReport) {
        super(examineReport);
    }
}