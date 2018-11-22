package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class ColumnSummary {

    private String logicColumnName;

    private String physicalColumnName;

    private String errorMessage;

    private int recordNumber;

    private String path;

    private List<ColumnDetailSummary> columnDetailSummaries;

}
