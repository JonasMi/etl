package com.nestvision.nest.proxy.nest.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JavaType;
import com.nestvision.nest.proxy.model.FieldModel;
import com.nestvision.nest.proxy.nest.service.FieldModelService;
import com.nestvision.nest.proxy.utils.JsonUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DefaultFieldModelService extends PathMatchingResourcePatternResolver implements FieldModelService{
    
    private Map<String,List<FieldModel>> fieldModelMap = new HashMap<>();
    
    @Override
    public  void loadFieldModelMaps() {
        JavaType javaType = JsonUtil.LIST_CONFIG_FIELD_TYPE;
        Resource[] resources;
        try {
            resources = getResources("classpath*:fieldJson/*.json");
            for(Resource resource : resources){
                List<FieldModel> fieldModels = JsonUtil.INSTANCE.fromJson(resource.getInputStream(), javaType);
                fieldModelMap.put(resource.getFilename().replace(".json", ""), fieldModels);
            }
            log.info("初始化完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        

    }


    @Override
    public List<FieldModel> getFieldModels(String name) {
        return fieldModelMap.get(name);
    }

}
