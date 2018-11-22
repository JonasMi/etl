package com.nestvision.nest.proxy.transform.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "message")
public class NestMessage {

    @XmlElement(name = "message-object")
    private String messageObject;

    @XmlElement(name = "nest-requests")
    private List<NestRequest> nestRequests;

    @XmlTransient
    public String getMessageObject() {
        return messageObject;
    }

    public void setMessageObject(String messageObject) {
        this.messageObject = messageObject;
    }
    
    @XmlTransient
    public List<NestRequest> getNestRequests() {
        return nestRequests;
    }

    public void setNestRequests(List<NestRequest> nestRequests) {
        this.nestRequests = nestRequests;
    }

   

}
