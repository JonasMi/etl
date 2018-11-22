package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class CoordinatorReferenceInterface {
	private String phsicalInterfaceName;
	private String logicInterfaceName;
	private Long count;
	private List<CoordinatorReferenceMessage> coordinatorReferenceMessages;
}
