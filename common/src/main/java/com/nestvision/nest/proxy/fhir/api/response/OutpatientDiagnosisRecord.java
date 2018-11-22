package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;

public class OutpatientDiagnosisRecord extends FhirResourceRecord {

    public OutpatientDiagnosisRecord(OutpatientDiagnosis outpatientDiagnosis) {
        super(outpatientDiagnosis);
    }
}