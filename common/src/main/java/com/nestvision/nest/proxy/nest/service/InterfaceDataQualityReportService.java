package com.nestvision.nest.proxy.nest.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.w3c.dom.Document;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.api.request.DataQualityRequest;
import com.nestvision.nest.proxy.nest.api.request.RateStatisticsRequest;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceDataItem;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceErrorType;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceOrg;
import com.nestvision.nest.proxy.nest.api.response.FireInterfacePrimaryKey;
import com.nestvision.nest.proxy.nest.api.response.FireInterfaceSummary;
import com.nestvision.nest.proxy.nest.api.response.RateStatisticResponse;
import com.nestvision.nest.proxy.nest.entity.InterfaceDataQualityReport;
import com.nestvision.nest.proxy.nest.service.impl.DefaultDataQualityReportService.QueryType;

public interface InterfaceDataQualityReportService extends BaseService<InterfaceDataQualityReport, String> {
    public Page<FireInterfaceSummary> dynamicQuery(DataQualityRequest dataQualityRequest, Pageable pageable, QueryType queryType);

    public Page<FireInterfacePrimaryKey> findMessageByDateItem(String dataItem, Pageable pageale, QueryType queryType, String logicName, String upHospital,
                                                               String path, String errorCode,DataQualityRequest dataQualityRequest);

    public Page<FireInterfaceOrg> findOrgDataQuality(DataQualityRequest dataQualityRequest, Pageable pageable);

    public List<FireInterfaceErrorType> findErrorTypes(String logicName, String upHospital,DataQualityRequest dataQualityRequest);

    public Page<FireInterfaceDataItem> findDataItemsByErrorType(String logicName, Pageable pageable, String upHospital, String errorType,DataQualityRequest dataQualityRequest,QueryType queryType);

    public String nameSpecialDeal(Document document, String physicalInterfaceName, String resourceName);

    public String specialName(String str);

    public String getInteractionNameByResource(String resource);
    
    public List<RateStatisticResponse> rateStatistic(RateStatisticsRequest rateStatisticsRequest);
}
