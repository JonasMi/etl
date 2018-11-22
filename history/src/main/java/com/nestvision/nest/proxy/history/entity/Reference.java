package com.nestvision.nest.proxy.history.entity;

import lombok.Data;

@Data
public class Reference {
	private String namespace;
	private String node;
	private String resourceType;
	private String type;
	private String value;
}
