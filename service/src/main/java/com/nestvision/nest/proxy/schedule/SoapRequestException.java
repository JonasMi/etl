package com.nestvision.nest.proxy.schedule;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.nest.client.NestResponse;

public class SoapRequestException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -472279743551344350L;

    private FhirResourceEntity originalMessage;

    private SoapRequest originalSoapRequest;

    private NestResponse originalResponse;

    public SoapRequestException(FhirResourceEntity originalMessage, SoapRequest originalSoapRequest, NestResponse originalResponse) {
        super();
        this.originalMessage = originalMessage;
        this.originalSoapRequest = originalSoapRequest;
        this.originalResponse = originalResponse;
    }

    public FhirResourceEntity getOriginalMessage() {
        return originalMessage;
    }

    public SoapRequest getOriginalSoapRequest() {
        return originalSoapRequest;
    }

    public NestResponse getOriginalResponse() {
        return originalResponse;
    }

}
