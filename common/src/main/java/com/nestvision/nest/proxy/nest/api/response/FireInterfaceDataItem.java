package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class FireInterfaceDataItem {
    private String describe;

    private String path;

    private String errorMsg;

    private Integer recordNumber;

    private String errorCode;

    private List<FireInterfacePrimaryKey> fireInterfacePrimaryKeys;
    
    private int total;
    
    private float errorRate;
}
