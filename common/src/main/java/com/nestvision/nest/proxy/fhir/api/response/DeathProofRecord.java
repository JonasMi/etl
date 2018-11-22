package com.nestvision.nest.proxy.fhir.api.response;

import com.nestvision.nest.proxy.base.api.response.FhirResourceRecord;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;

public class DeathProofRecord extends FhirResourceRecord {

    public DeathProofRecord(DeathProof deathProof) {
        super(deathProof);
    }
}