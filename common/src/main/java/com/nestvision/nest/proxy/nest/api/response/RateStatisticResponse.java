package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class RateStatisticResponse {
	private String upHospital;
	private String upHospitalName;
	List<ErrorDetailPeriodTime> errorDetailPeriodTimes;
}
