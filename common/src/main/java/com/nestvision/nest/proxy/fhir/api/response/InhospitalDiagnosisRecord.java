package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;

public class InhospitalDiagnosisRecord extends FhirResourceRecord {

    public InhospitalDiagnosisRecord(InhospitalDiagnosis inhospitalDiagnosis) {
        super(inhospitalDiagnosis);
    }
}