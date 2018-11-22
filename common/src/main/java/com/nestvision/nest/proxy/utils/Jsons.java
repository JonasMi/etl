package com.nestvision.nest.proxy.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nestvision.nest.proxy.JsonException;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.util.StringUtils;

public class Jsons {

    /**
     * 忽略对象中值为NULL或""的属性
     */
    public static final Jsons EXCLUDE_EMPTY = new Jsons(JsonInclude.Include.NON_EMPTY);

    /**
     * 忽略对象中值为默认值的属性
     */
    public static final Jsons EXCLUDE_DEFAULT = new Jsons(JsonInclude.Include.NON_DEFAULT);

    /**
     * 默认不排除任何属性
     */
    public static final Jsons DEFAULT = new Jsons();

    private ObjectMapper mapper;

    private Jsons() {
        mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    private Jsons(JsonInclude.Include include) {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(include);
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public String toJson(Object target) {
        try {
            return mapper.writeValueAsString(target);
        } catch (IOException e) {
                throw new JsonException(e);
        }
    }

    public <T> T fromJson(String json, Class<T> target) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
            return mapper.readValue(json, target);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T fromJson(String jsonString, JavaType javaType) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        try {
            return (T) mapper.readValue(jsonString, javaType);
        } catch (Exception e) {
            throw new JsonException(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> T fromJson(InputStream input,JavaType javaType){
        try {
            return (T)mapper.readValue(input, javaType);
        }  catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public JavaType createCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}