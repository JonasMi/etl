package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.LongtermAdviceRepository;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;
import com.nestvision.nest.proxy.fhir.service.LongtermAdviceService;

@Service
public class DefaultLongtermAdviceService extends AbstractBaseService<LongtermAdvice, String> implements LongtermAdviceService {

    @Autowired
    private LongtermAdviceRepository longtermAdviceRepository;

    @Override
    protected BaseRepository<LongtermAdvice, String> getBaseRepository() {

        return longtermAdviceRepository;
    }

}
