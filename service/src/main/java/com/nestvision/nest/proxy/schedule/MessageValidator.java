package com.nestvision.nest.proxy.schedule;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;

public interface MessageValidator<T extends FhirResourceEntity> {

    public MessageValidateResult validate(T fhirResourceEntity);
}
