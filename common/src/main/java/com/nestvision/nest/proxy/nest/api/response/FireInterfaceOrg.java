package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

import lombok.Data;

@Data
public class FireInterfaceOrg {

    private String orgName;

    private Float errorRate=0f;

    private String upHospital;

    private long messageCount=0;
    
    private long errorCount = 0;
}
