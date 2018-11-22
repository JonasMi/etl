package com.nestvision.nest.proxy.history.entity;

import lombok.Data;

@Data
public class Lookuptable {
	private Boolean archived;
	private int cacheSize;
	private String defaultValue;
	private String description;
	private String identifier;
	private String leftSideDefaultValue;
	private String leftSideName;
	private Boolean leftSideUseOriginalValue;
	private String name;
	private String rightSideDefaultValue;
	private String rightSideName;
	private Boolean rightSideUseOriginalValue;
}
