package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MidRepository;
import com.nestvision.nest.proxy.fhir.entity.Mid;
import com.nestvision.nest.proxy.fhir.service.MidService;

@Service
public class DefaultMidService extends AbstractBaseService<Mid, String> implements MidService {

    @Autowired
    private MidRepository midRepository;

    @Override
    protected BaseRepository<Mid, String> getBaseRepository() {

        return midRepository;
    }

}
