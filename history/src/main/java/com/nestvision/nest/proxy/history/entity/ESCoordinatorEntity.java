package com.nestvision.nest.proxy.history.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ESCoordinatorEntity {
	private String hospital;
	
	private String upHospital;
	
	private String interfaceName;
	
	private String logicInterfaceName;
	
	private Date upTime;
	
	private String identifier;
	
	private String searchKey;
	
	private String type;
	
}
