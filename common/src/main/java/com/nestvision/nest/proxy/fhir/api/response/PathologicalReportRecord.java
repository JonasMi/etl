package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;

public class PathologicalReportRecord extends FhirResourceRecord {

    public PathologicalReportRecord(PathologicalReport pathologicalReport) {
        super(pathologicalReport);
    }
}