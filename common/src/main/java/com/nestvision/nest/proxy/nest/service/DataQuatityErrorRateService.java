package com.nestvision.nest.proxy.nest.service;

import java.util.List;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.nest.api.request.RateStatisticsRequest;
import com.nestvision.nest.proxy.nest.api.response.RateStatisticResponse;
import com.nestvision.nest.proxy.nest.api.response.SolveDegreeWrapperResponse;
import com.nestvision.nest.proxy.nest.entity.DataQualityErrorRate;

public interface DataQuatityErrorRateService extends BaseService<DataQualityErrorRate, String> {
	public List<RateStatisticResponse> rateStatistic(RateStatisticsRequest rateStatisticsRequest);
	
	public List<SolveDegreeWrapperResponse> solveDegreeStatistic(RateStatisticsRequest rateStatisticsRequest);
	
}
