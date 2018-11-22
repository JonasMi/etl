package com.nestvision.nest.proxy.history.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "message")
public class CoordinatorErrorMsg {
	private String credential;
	private String identifierNP;
	private String identifierVal;
	private String messageId;
	private String payload;
	private List<Reference> references;
	private int sendTime;
	private String soapAction;
	private String type;
	private String url;
}
