package com.nestvision.nest.proxy.nest.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.nestvision.nest.proxy.nest.model.Value;
import com.nestvision.nest.proxy.nest.model.ValueRange;
import com.nestvision.nest.proxy.nest.service.ValueRangeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultValueRangeService implements ValueRangeService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<String, Map<String, Value>> valuesRangeMap = new HashMap<>();

    @SuppressWarnings("unchecked")
	private Map<String, Map<String, Value>> load(Resource resource) throws IOException {
        String resourceName = resource.getFilename();
        log.info("正在从{}加载数据字段值域定义...", resourceName);
        InputStream inputStream = null;
        try {
            inputStream = resource.getInputStream();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            CollectionLikeType type = objectMapper.getTypeFactory().constructCollectionLikeType(ArrayList.class, ValueRange.class);
            List<ValueRange> valueRanges = (List<ValueRange>) objectMapper.readValue(inputStream, type);
            Map<String, Map<String, Value>> map = load(valueRanges);
            log.info("从{}加载数据字段值域定义完成!总共加载了{}个映射表的值域定义", resourceName, map.size());
            return map;
        } catch (IOException e) {
            log.error("在加载值域数据文件的时候发生错误:" + e.getMessage(), e);
            throw e;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    @PostConstruct
    public void load() throws IOException {

        final String locationPattern = "classpath:validator/*ValueRanges.json";
        Resource[] resoures = applicationContext.getResources(locationPattern);
        for (Resource resource : resoures) {          
            valuesRangeMap.putAll(load(resource));
        }

    }


    private Map<String, Map<String, Value>> load(List<ValueRange> valueRanges) {
        Map<String, Map<String, Value>> resultMap = new HashMap<>();
        for (ValueRange valueRange : valueRanges) {
            String name = valueRange.getName();
            Map<String, Value> map = getOrCreateValueSet(resultMap, name);
            List<Value> values = valueRange.getValues();
            for (Value value : values) {
                map.put(value.getCode(), value);
            }
        }
        return resultMap;
    }

    @Override
    public boolean contains(String valuesRange, String code) {
        boolean contains = false;
        Map<String, Value> valueSet = valuesRangeMap.get(valuesRange);
        if (valueSet != null) {
            contains = valueSet.containsKey(code);
        }
        return contains;
    }

    private Map<String, Value> getOrCreateValueSet(Map<String, Map<String, Value>> resultMap, String valuesRange) {
        Map<String, Value> valueSet = resultMap.get(valuesRange);
        if (valueSet == null) {
            valueSet = new HashMap<>();
            resultMap.put(valuesRange, valueSet);
        }
        return valueSet;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
