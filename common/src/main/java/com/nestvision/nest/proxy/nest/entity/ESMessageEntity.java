package com.nestvision.nest.proxy.nest.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ESMessageEntity {
	private String hospital;
	
	private String upHospital;
	
	private String interfaceName;
	
	private String logicInterfaceName;
	
	private Date upTime;
	
	private String identifier;
	
	private long status = 1;
	
	private int statusFlag;
	
	private String type;
	
	
}
