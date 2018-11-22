package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class SolveDegreeWrapperResponse {
	private String upHospital;
	private String upHospitalName;
	private List<SolveDegreePeriodTime> solveDegreePeriodTimes;
}
