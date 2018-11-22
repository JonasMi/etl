package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class NestStatisticsWrapper {

    private List<NestStatistics> data;

    private Boolean error;

}
