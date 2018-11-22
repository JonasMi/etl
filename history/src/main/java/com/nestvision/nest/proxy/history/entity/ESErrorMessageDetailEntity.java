package com.nestvision.nest.proxy.history.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ESErrorMessageDetailEntity {
	private String errorType;
	private String upHospital;
	private String logicInterfaceName;
	private Date upTime;
	private String dataItem;
	private String errorMsg;
	private String identifier;
	private String searchKey;
	private String type;
}
