package com.nestvision.nest.proxy.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class FieldModel {
    private String name;
    private String displayName;
    private String type;
    private String javaName;
    private String note;
    private Boolean nullable;
    private String check;
    private String valueHandler;
}
