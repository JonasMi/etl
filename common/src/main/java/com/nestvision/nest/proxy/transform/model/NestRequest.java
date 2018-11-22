package com.nestvision.nest.proxy.transform.model;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class NestRequest {

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "resource-type")
    private String resourceType;

    @XmlElement(name = "soap-action")
    private String soapAction;

    @XmlElement(name = "request-body")
    private String body;

    @XmlElement(name = "sended")
    private boolean sended;

    @XmlElement(name = "success")
    private boolean success;

    @XmlElement(name = "error-type")
    @Deprecated
    private String errorType;

    @XmlElement(name = "error-message")
    private String errorMessage;

    @XmlElement(name = "error-detail")
    @Deprecated
    private String errorDetail;

    @XmlElement(name = "message-order")
    private Integer messageOrder;

    @XmlElement(name = "message-id")
    private String messageId;

    @XmlElement(name = "message-class")
    private String messageClass;

    @XmlElement(name = "cn")
    private String cn;

    @XmlElement(name = "sendTime")
    private Long sendTime;

    @XmlElement(name = "retryTimes")
    private Integer retryTimes;

    @XmlElement(name = "processResult")
    private String processResult;

    @XmlTransient
    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    @XmlTransient
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlTransient
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @XmlTransient
    public String getSoapAction() {
        return soapAction;
    }

    public void setSoapAction(String soapAction) {
        this.soapAction = soapAction;
    }

    @XmlTransient
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @XmlTransient
    public boolean isSended() {
        return sended;
    }

    public void setSended(boolean sended) {
        this.sended = sended;
    }

    @XmlTransient
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @XmlTransient
    public Integer getMessageOrder() {
        return messageOrder;
    }

    public void setMessageOrder(Integer messageOrder) {
        this.messageOrder = messageOrder;
    }

    @XmlTransient
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @XmlTransient
    public String getMessageClass() {
        return messageClass;
    }

    public void setMessageClass(String messageClass) {
        this.messageClass = messageClass;
    }

    @XmlTransient
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    @XmlTransient
    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    @XmlTransient
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    @XmlTransient
    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    @XmlTransient
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @XmlTransient
    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
