package com.nestvision.nest.proxy.history.service;

import java.util.List;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.transform.model.NestRequest;

public interface HistoryService {

    public void add(FhirResourceEntity fhirResourceEntity,List<NestRequest> nestRequests);
}
