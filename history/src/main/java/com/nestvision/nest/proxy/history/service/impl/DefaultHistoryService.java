package com.nestvision.nest.proxy.history.service.impl;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.service.BaseService;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.history.service.HistoryService;
import com.nestvision.nest.proxy.nest.service.NestRequestService;
import com.nestvision.nest.proxy.transform.model.NestRequest;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultHistoryService implements HistoryService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private NestRequestService nestRequestService;

    @Override
    @Transactional
    public void add(FhirResourceEntity fhirResourceEntity, List<NestRequest> nestRequests) {
        BaseService<FhirResourceEntity, String> baseService = detectServiceBean(fhirResourceEntity);
        baseService.save(fhirResourceEntity);
        nestRequestService.save(fhirResourceEntity.getClass(), nestRequests);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.applicationContext = applicationContext;

    }

    private BaseService<FhirResourceEntity, String> detectServiceBean(FhirResourceEntity fhirResourceEntity) {
        String entityClassName = fhirResourceEntity.getClass().getSimpleName();
        String beanName = "default" + entityClassName + "Service";
        log.debug("根据消息类名动态获取对应的Service接口实现,beanName={}", beanName);
        try {
            @SuppressWarnings("unchecked")
            BaseService<FhirResourceEntity, String> baseService = applicationContext.getBean(beanName, BaseService.class);
            return baseService;
        } catch (BeansException e) {
            log.error("在根据消息类名动态获取对应的Service接口实现的时候发生错误:" + e.getMessage(), e);
            throw e;
        }

    }

}
