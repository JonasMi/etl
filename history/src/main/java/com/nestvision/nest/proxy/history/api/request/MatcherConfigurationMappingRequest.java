package com.nestvision.nest.proxy.history.api.request;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.nestvision.nest.proxy.history.match.MatcherConfiguration;

import lombok.Data;

@Data
public class MatcherConfigurationMappingRequest {

    @NotBlank(message = "匹配规则所对应的类不能为空")
    private String clazz;

    @NotNull(message = "未指定匹配规则")
    private MatcherConfiguration matcher;

}
