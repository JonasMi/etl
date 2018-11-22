package com.nestvision.nest.proxy.nest.api.response;

import java.util.List;

import lombok.Data;

@Data
public class Authentication {

    private String token;

    private List<String> roles;
}
