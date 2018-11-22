package com.nestvision.nest.proxy.fhir.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nestvision.nest.proxy.base.util.URLUtil;
import com.nestvision.nest.proxy.fhir.service.FhirDataMappingService;

@Service
public class DefaultFhirDataMappingService implements FhirDataMappingService {

    @Value("${nest.api.url}")
    private String nestApiUrl;

    @Value("${nest.api.tenant.id}")
    private String tenantId;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private RestTemplate restTemplate = new RestTemplate();

    private String getMappingValueFromCache(String table, String key) {
        String cacheKey = buildMappingValueCacheKey(table, key);
        return stringRedisTemplate.boundValueOps(cacheKey).get();
    }

    private void putMappingValueToCache(String table, String key, String value) {
        String cacheKey = buildMappingValueCacheKey(table, key);
        stringRedisTemplate.boundValueOps(cacheKey).set(value);
        expire(cacheKey);
    }

    private void expire(String key) {
        stringRedisTemplate.boundValueOps(key).expire(5, TimeUnit.MINUTES);
    }

    private String getMappingValueFromApi(String table, String key) {
        String url = URLUtil.concat(nestApiUrl, "/lookuptable-interfaces/");

        Map<String, String> args = new HashMap<>();
        args.put("tableName", table);
        args.put("leftSide", key);
        args.put("tenantId", tenantId);

        @SuppressWarnings("unchecked")
        Map<String, Object> map = restTemplate.postForObject(url, args, Map.class);

        Object obj = map.get("rightSide");

        String value = obj.toString();

        return value;
    }

    private String buildMappingValueCacheKey(String table, String key) {

        return "nest:api:dataMapping:" + table + ":" + key;
    }

    @Override
    public String getMappingValue(String table, String key, String defaultValue) {

        String value = getMappingValueFromCache(table, key);
        if (value == null) {
            value = getMappingValueFromApi(table, key);
            if (value != null) {
                putMappingValueToCache(table, key, value);
            }
        }
        if (value != null) {
            return value;
        }
        return defaultValue;
    }

    @Override
    public String getMappingValue(String table, String key) {

        return getMappingValue(table, key, null);
    }

}
