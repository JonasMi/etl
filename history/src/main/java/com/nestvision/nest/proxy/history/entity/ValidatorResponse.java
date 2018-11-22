package com.nestvision.nest.proxy.history.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class ValidatorResponse {
	 private String ruleFileName;
	 private ValidatorOperationOutcome validatorOperationOutcome;
}
