package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class TableSummary {

    private String physicalTableName;

    private String logicTableName;

    private Float errorRate;

    private Integer recordNumber;

    private List<ColumnSummary> columnSummaries;

}
