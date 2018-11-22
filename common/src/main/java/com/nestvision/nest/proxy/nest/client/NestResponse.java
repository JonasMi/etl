package com.nestvision.nest.proxy.nest.client;

import lombok.Data;

@Data
public class NestResponse {

    private boolean success;

    private String faultString;

    private String cdrId;
}
