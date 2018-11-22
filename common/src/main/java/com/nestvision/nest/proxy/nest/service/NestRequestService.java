package com.nestvision.nest.proxy.nest.service;

import java.util.List;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.nest.NestRequestException;
import com.nestvision.nest.proxy.transform.model.NestRequest;

public interface NestRequestService {

    public void save(Class<? extends FhirResourceEntity> clazz, List<NestRequest> nestRequests);

    public NestRequest findOne(Class<? extends FhirResourceEntity> clazz, String id);

    public NestRequest findOne(String tableName, String id);

    public void deleteNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId);

    public List<NestRequest> findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId);

    public List<NestRequest> findNestRequests(Class<? extends FhirResourceEntity> clazz, String messageId, boolean success);

    public void update(Class<? extends FhirResourceEntity> clazz, NestRequest nestRequest);

    public void update(String tableName, NestRequest nestRequest);

    public void retry(NestRequest nestRequest) throws NestRequestException;

}
