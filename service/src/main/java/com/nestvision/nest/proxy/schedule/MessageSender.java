package com.nestvision.nest.proxy.schedule;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;

public interface MessageSender<T extends FhirResourceEntity> {

    public void send(T message);
}
