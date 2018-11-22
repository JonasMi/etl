package com.nestvision.nest.proxy.history.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class ValidatorOperationOutcome {
	private List<Object> issues;
}
