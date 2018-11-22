package com.nestvision.nest.proxy.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.transform.model.NestRequest;

public class SoapRequestResult {
    private List<NestRequest> nestRequests;

    List<NestRequest> getNestRequests() {
        return this.nestRequests;
    }

    public NestRequest getNestRequest(int index) {
        return nestRequests.get(index);
    }

    public SoapRequestResult(FhirResourceEntity message, List<SoapRequest> soapRequests) {
        this.nestRequests = new ArrayList<>(soapRequests.size());
        for (int i = 0; i < soapRequests.size(); i++) {
            SoapRequest soapRequest = soapRequests.get(i);
            NestRequest nestRequest = new NestRequest();
            nestRequest.setId(UUID.randomUUID().toString());
            nestRequest.setCn(message.getUpHospital());
            nestRequest.setMessageId(message.getUid());
            nestRequest.setMessageClass(message.getClass().getName());
            nestRequest.setMessageOrder(i);
            nestRequest.setBody(soapRequest.getBody());
            nestRequest.setResourceType(soapRequest.getResourceType());
            nestRequest.setSoapAction(soapRequest.getSoapAction());
            nestRequest.setSended(false);
            nestRequest.setSuccess(false);
            this.nestRequests.add(nestRequest);
        }
    }

}
