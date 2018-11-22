package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class FireInterfaceErrorType {
    private String errorType;

    private Float errorRate;
    
    private int total;
    
    private int count;

    private List<FireInterfaceDataItem> fireInterfaceDataItems;
}
