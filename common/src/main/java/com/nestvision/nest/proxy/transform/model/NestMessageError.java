package com.nestvision.nest.proxy.transform.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class NestMessageError {

    @XmlElement(name = "type")
    private String type;

    @XmlElement(name = "message")
    private String message;

    @XmlElement(name = "detail")
    private String detail;

    @XmlTransient
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlTransient
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
