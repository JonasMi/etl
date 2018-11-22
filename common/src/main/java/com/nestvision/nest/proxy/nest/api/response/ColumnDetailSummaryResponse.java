package com.nestvision.nest.proxy.nest.api.response;

import org.springframework.data.domain.Page;

import lombok.Data;

@Data
public class ColumnDetailSummaryResponse {

    private Page<ColumnDetailSummary> columnDetailPage;

    private String logicColumnName;

    private String physicalColumnName;

    private String logicPrimaryKeyName;

    private String physicalPrimaryKeyName;

}
