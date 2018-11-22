package com.nestvision.nest.proxy.nest.api.response;

import com.nestvision.nest.proxy.transform.model.NestRequest;

public class NestRequestDetail extends NestRequestRecord {

    private String body;

    private String errorType;

    private String errorMessage;

    private String errorDetail;

    public NestRequestDetail(NestRequest nestRequest) {
        super(nestRequest);
        this.body = nestRequest.getBody();
        this.errorType = nestRequest.getErrorType();
        this.errorMessage = nestRequest.getErrorMessage();
        this.errorDetail = nestRequest.getErrorDetail();

    }

    public String getBody() {
        return body;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

}
