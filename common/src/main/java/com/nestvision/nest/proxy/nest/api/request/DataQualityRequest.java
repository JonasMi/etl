package com.nestvision.nest.proxy.nest.api.request;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class DataQualityRequest {
    private Date start = getStartDate();

    private Date end = new Date();

    private String tableName;

    private String orgName;

    private String type;
    
    private Date getStartDate(){
    	Date start = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	try {
    		start = sdf.parse("2017-10-29 00:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return start;
    }

}
