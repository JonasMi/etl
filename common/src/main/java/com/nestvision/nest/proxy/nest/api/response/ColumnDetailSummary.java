package com.nestvision.nest.proxy.nest.api.response;

import java.util.Date;

import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.OperationState;

import lombok.Data;

@Data
public class ColumnDetailSummary {
    private String id;

    private Date upTime;

    private OperationState operationState;

    private String columnValue;

    private String identifier;
}
