package com.nestvision.nest.proxy.history.entity;

import lombok.Data;

@Data
public class Tenant {
	private Boolean archived;
	private String contactInformation;
	private String description;
	private String identifier;
	private String name;
	private String organizationName;
}
