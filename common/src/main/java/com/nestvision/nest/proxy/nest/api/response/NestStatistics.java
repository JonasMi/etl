package com.nestvision.nest.proxy.nest.api.response;

import lombok.Data;

@Data
public class NestStatistics {
    private int callTimes;

    private String deploymentName;

    private String dimensionText;

    private int errorRatio;

    private int errorTimes;
}
