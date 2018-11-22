package com.nestvision.nest.proxy.nest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.response.ColumnDetailSummary;
import com.nestvision.nest.proxy.nest.api.response.ColumnSummary;
import com.nestvision.nest.proxy.nest.api.response.TableSummary;
import com.nestvision.nest.proxy.nest.entity.DataQualityReport;
import com.nestvision.nest.proxy.nest.service.impl.DefaultDataQualityReportService.QueryType;

public interface DataQualityReportService extends BaseService<DataQualityReport, String> {
    public Page<TableSummary> dynamicQuery(DataQualityRequest dataQualityRequest, Pageable pageable, QueryType queryType);

    public Page<ColumnSummary> findByPhysicalTableName(String physicalTableName, Pageable pageable, QueryType queryType);

    public Page<ColumnDetailSummary> findByColumnName(String columnName, Pageable pageable, QueryType queryType, String physicalTableName);

    public String findLogicNameByColumnName(String columnName);
}
