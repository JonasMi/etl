package com.nestvision.nest.proxy.nest.api.response;

import lombok.Data;

@Data
public class CoordinatorReferenceMessage {
	private String type;
	private String identifier;
	private Integer count;
}
