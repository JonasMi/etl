package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;

public class BirthCertificateRecord extends FhirResourceRecord {

    public BirthCertificateRecord(BirthCertificate birthCertificate) {
        super(birthCertificate);
    }
}