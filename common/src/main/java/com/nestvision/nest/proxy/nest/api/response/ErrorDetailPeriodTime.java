package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorDetailPeriodTime {
	private Long messageCount=0L;
    
    private Long errorCount=0L;
    
    private float errorRate=0f;
    
    private Date time;
    
    private String describe;
}
