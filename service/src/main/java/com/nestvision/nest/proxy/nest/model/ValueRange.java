package com.nestvision.nest.proxy.nest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueRange {

    private String name;

    @JsonProperty(value = "concept")
    private List<Value> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

}
