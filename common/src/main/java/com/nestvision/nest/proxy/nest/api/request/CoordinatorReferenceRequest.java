package com.nestvision.nest.proxy.nest.api.request;

import lombok.Data;

@Data
public class CoordinatorReferenceRequest {
	private String hospital;
	private String interfaceName;
	private String identifier;
}
