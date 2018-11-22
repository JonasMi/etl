package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;

import lombok.Data;

@Data
public class FireInterfacePrimaryKey {

    private String identifier;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date upTime;

    private OperationState operationState;

    private String message;

    private String errorDetail;

    private String elementPath;
    
    private String id;

}
