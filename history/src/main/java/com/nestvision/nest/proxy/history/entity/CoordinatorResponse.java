package com.nestvision.nest.proxy.history.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoordinatorResponse {
	private Boolean success;
	
	private CoordinatorMessageData data;
	
	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	public class CoordinatorMessageData{
		private List<Object> referencesNotExist;
	}
}
