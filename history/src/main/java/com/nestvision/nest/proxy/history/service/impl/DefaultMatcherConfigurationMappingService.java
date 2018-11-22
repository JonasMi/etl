package com.nestvision.nest.proxy.history.service.impl;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.history.dao.MatcherConfigurationMappingRepository;
import com.nestvision.nest.proxy.history.entity.MatcherConfigurationMapping;
import com.nestvision.nest.proxy.history.service.MatcherConfigurationMappingService;

@Service
public class DefaultMatcherConfigurationMappingService extends AbstractBaseService<MatcherConfigurationMapping, String>
                implements MatcherConfigurationMappingService {
    @Autowired
    private MatcherConfigurationMappingRepository matcherConfigurationMappingRepository;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    protected BaseRepository<MatcherConfigurationMapping, String> getBaseRepository() {

        return matcherConfigurationMappingRepository;
    }

    private void expireCache(String cacheKey) {
        stringRedisTemplate.expire(cacheKey, 10, TimeUnit.MINUTES);
    }

    private String buildCacheKey(String id) {

        return "cache:MatcherConfigurationMapping:" + id;
    }

    @Override
    @Transactional(readOnly=true)
    public MatcherConfigurationMapping findOne(String id) {
        MatcherConfigurationMapping matcherConfigurationMapping = getFromCache(id);
        if (matcherConfigurationMapping == null) {
            matcherConfigurationMapping = matcherConfigurationMappingRepository.findOne(id);
            if (matcherConfigurationMapping != null) {
                putToCache(id, matcherConfigurationMapping);
            }
        }
        return matcherConfigurationMapping;
    }

    private void putToCache(String id, MatcherConfigurationMapping matcherConfigurationMapping) {
        String cacheKey = buildCacheKey(id);
        String json = JSONUtil.toJSONString(matcherConfigurationMapping);
        stringRedisTemplate.boundValueOps(cacheKey).set(json);
        expireCache(cacheKey);

    }

    private MatcherConfigurationMapping getFromCache(String id) {
        String cacheKey = buildCacheKey(id);
        String json = stringRedisTemplate.boundValueOps(cacheKey).get();
        if (!StringUtils.isBlank(json)) {
            expireCache(cacheKey);
            return JSONUtil.readObject(json, MatcherConfigurationMapping.class);
        }
        return null;
    }

    @Override
    @Transactional
    public void save(MatcherConfigurationMapping entity) {
        super.save(entity);
        putToCache(entity.getClazz(), entity);
    }
    @Override
    @Transactional
    public void saveAll(Iterable<MatcherConfigurationMapping> entities) {
        for(MatcherConfigurationMapping mapping:entities){
            save(mapping);
        }    
    }

  
}