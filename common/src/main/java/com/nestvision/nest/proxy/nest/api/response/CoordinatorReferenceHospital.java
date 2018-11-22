package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class CoordinatorReferenceHospital {
	private String uphospital;
	private String uphospitalName;
	private Long count;
	private List<CoordinatorReferenceInterface> coordinatorReferenceInterfaces;
}
