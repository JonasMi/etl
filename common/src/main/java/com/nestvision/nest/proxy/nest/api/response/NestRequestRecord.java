package com.nestvision.nest.proxy.nest.api.response;

import com.nestvision.nest.proxy.transform.model.NestRequest;

public class NestRequestRecord {

    private String id;

    private String resourceType;

    private String cn;

    private String soapAction;

    private boolean sended;

    private boolean success;

    private Integer order;

    private Long sendTime;

    private Integer retryTimes;

    public NestRequestRecord(NestRequest nestRequest) {

        this.id = nestRequest.getId();
        this.resourceType = nestRequest.getResourceType();
        this.cn = nestRequest.getCn();
        this.soapAction = nestRequest.getSoapAction();
        this.sended = nestRequest.isSended();
        this.success = nestRequest.isSuccess();
        this.order = nestRequest.getMessageOrder();
        this.sendTime = nestRequest.getSendTime();
        this.retryTimes = nestRequest.getRetryTimes();
    }

    public String getId() {
        return id;
    }

    public String getResourceType() {
        return resourceType;
    }

    public String getCn() {
        return cn;
    }

    public String getSoapAction() {
        return soapAction;
    }

    public boolean isSended() {
        return sended;
    }

    public boolean isSuccess() {
        return success;
    }

    public Integer getOrder() {
        return order;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

}
