package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;

public class PathologyDiagnosisRecord extends FhirResourceRecord {

    public PathologyDiagnosisRecord(PathologyDiagnosis pathologyDiagnosis) {
        super(pathologyDiagnosis);
    }
}