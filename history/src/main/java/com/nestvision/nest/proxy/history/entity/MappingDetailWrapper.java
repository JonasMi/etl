package com.nestvision.nest.proxy.history.entity;

import java.util.List;

import lombok.Data;

@Data
public class MappingDetailWrapper {
	private List<MappingDetail> content;
	private Integer totalPages;
	private Boolean firshPage;
	private Boolean lastPage;
	private Integer numberOfElements;
	private Integer totalElements;
	private Integer size;
	private Integer number;
}