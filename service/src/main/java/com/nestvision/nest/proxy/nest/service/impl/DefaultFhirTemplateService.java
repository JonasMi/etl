package com.nestvision.nest.proxy.nest.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.FhirTemplateRepository;
import com.nestvision.nest.proxy.nest.entity.FhirTemplate;
import com.nestvision.nest.proxy.nest.service.FhirTemplateService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultFhirTemplateService extends AbstractBaseService<FhirTemplate, String> implements FhirTemplateService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private FhirTemplateRepository fhirTemplateRepository;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    
    @Value("${resource.path.template}")
    private String templateResourcePath;

    @PostConstruct
    protected void init() {

        Resource[] resources = null;
        try {
            /*resources = applicationContext.getResources("classpath*:templates/*.ftl");*/
        	resources = applicationContext.getResources(templateResourcePath);
        } catch (IOException e) {
            log.error("无法加载消息模板目录:{}",templateResourcePath, e);
        }
        if (resources != null) {
            for (Resource resource : resources) {
                String templateName = FilenameUtils.getBaseName(resource.getFilename());
                if (!exists(templateName)) {
                    create(templateName, resource);
                    log.debug("检查到消息模板{}不存在,已经创建新的消息模板:{}", templateName, templateName);
                } else {
                    log.debug("检查到消息模板{}已经存在,取消创建新的消息模板:{}", templateName, templateName);
                }
            }
        }
    }

    private void create(String templateName, Resource resource) {

        FhirTemplate fhirTemplate = new FhirTemplate();
        fhirTemplate.setName(templateName);
        InputStream input = null;
        try {
            input = resource.getInputStream();
            String template = IOUtils.toString(input, Charset.forName("UTF-8"));
            fhirTemplate.setTemplate(template);
            save(fhirTemplate);
        } catch (IOException e) {
            log.error("创建新的消息消息模板[" + templateName + "]发生错误:" + e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(input);
        }
    }

    private String buildCacheKey(String id) {
        return "cache:fhir-templates:" + id;
    }

    private void expire(String cacheKey) {
        stringRedisTemplate.boundValueOps(cacheKey).expire(10, TimeUnit.MINUTES);
    }

    private void deleteFromCache(String id) {
        String cacheKey = buildCacheKey(id);
        stringRedisTemplate.delete(cacheKey);
    }

    private FhirTemplate getFromCache(String id) {
        FhirTemplate fhirTemplate = null;
        String cacheKey = buildCacheKey(id);
        String template = stringRedisTemplate.boundValueOps(cacheKey).get();
        if (template != null) {
            fhirTemplate = new FhirTemplate();
            fhirTemplate.setName(id);
            fhirTemplate.setTemplate(template);
            expire(cacheKey);
        }
        return fhirTemplate;
    }

    private void putToCache(FhirTemplate fhirTemplate) {
        String name = fhirTemplate.getName();
        String cacheKey = buildCacheKey(name);
        stringRedisTemplate.boundValueOps(cacheKey).set(fhirTemplate.getTemplate());
        expire(cacheKey);
    }

    @Override
    @Transactional(readOnly = true)
    public FhirTemplate findOne(String id) {
        FhirTemplate fhirTemplate = getFromCache(id);
        if (fhirTemplate == null) {
            fhirTemplate = fhirTemplateRepository.findOne(id);
            if (fhirTemplate != null) {
                putToCache(fhirTemplate);
            }
        }
        return fhirTemplate;
    }

    @Override
    @Transactional
    public void save(FhirTemplate entity) {

        fhirTemplateRepository.save(entity);
        putToCache(entity);
    }

    @Override
    @Transactional
    public void delete(String id) {

        fhirTemplateRepository.delete(id);
        deleteFromCache(id);
    }

    @Override
    @Transactional
    public void delete(FhirTemplate entity) {
        fhirTemplateRepository.delete(entity);
        deleteFromCache(entity.getName());
    }

    @Override
    protected BaseRepository<FhirTemplate, String> getBaseRepository() {

        return fhirTemplateRepository;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;

    }

}
