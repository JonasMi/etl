package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.TemporaryAdviceRepository;
import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;
import com.nestvision.nest.proxy.fhir.service.TemporaryAdviceService;

@Service
public class DefaultTemporaryAdviceService extends AbstractBaseService<TemporaryAdvice, String> implements TemporaryAdviceService {

    @Autowired
    private TemporaryAdviceRepository temporaryAdviceRepository;

    @Override
    protected BaseRepository<TemporaryAdvice, String> getBaseRepository() {

        return temporaryAdviceRepository;
    }

}
