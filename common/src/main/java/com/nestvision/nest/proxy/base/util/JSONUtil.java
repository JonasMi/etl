package com.nestvision.nest.proxy.base.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionLikeType;

public class JSONUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();
    static {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String toJSONString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readObject(String source, Class<T> clazz) {
        try {
            return objectMapper.readValue(source, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> readList(InputStream input, Class<T> elementClass) {
        CollectionLikeType type = objectMapper.getTypeFactory().constructCollectionLikeType(ArrayList.class, elementClass);
        try {
            return (List<T>) objectMapper.readValue(input, type);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
