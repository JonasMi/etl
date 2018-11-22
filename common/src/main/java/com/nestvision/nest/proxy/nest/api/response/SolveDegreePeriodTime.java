package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;

import lombok.Data;

@Data
public class SolveDegreePeriodTime {
	private Integer errorCount = 0;
	private Integer solveCount = 0;
	private Date time;
	private float solveRate = 0f;
	private String describe;
}	
