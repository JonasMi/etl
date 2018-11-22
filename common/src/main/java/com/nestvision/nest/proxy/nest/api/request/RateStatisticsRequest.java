package com.nestvision.nest.proxy.nest.api.request;

import java.util.Date;

import javax.validation.constraints.NotNull;


import lombok.Data;

@Data
public class RateStatisticsRequest {
	private Date endTime = new Date();
	@NotNull
	private StatisticsType statisticsType;
	private String upHospital;
	
	public enum StatisticsType{
		last30days,last12month,last13week
	}
}
