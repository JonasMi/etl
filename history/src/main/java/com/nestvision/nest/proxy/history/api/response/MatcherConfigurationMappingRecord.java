package com.nestvision.nest.proxy.history.api.response;

import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.history.entity.MatcherConfigurationMapping;
import com.nestvision.nest.proxy.history.match.MatcherConfiguration;

import lombok.Data;

@Data
public class MatcherConfigurationMappingRecord {

    private String clazz;

    private MatcherConfiguration matcher;

    public MatcherConfigurationMappingRecord(MatcherConfigurationMapping mapping) {
        this.clazz = mapping.getClazz();
        this.matcher = JSONUtil.readObject(mapping.getMatcher(), MatcherConfiguration.class);
    }
}
