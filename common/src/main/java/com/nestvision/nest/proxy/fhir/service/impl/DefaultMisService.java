package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MisRepository;
import com.nestvision.nest.proxy.fhir.entity.Mis;
import com.nestvision.nest.proxy.fhir.service.MisService;

@Service
public class DefaultMisService extends AbstractBaseService<Mis, String> implements MisService {

    @Autowired
    private MisRepository misRepository;

    @Override
    protected BaseRepository<Mis, String> getBaseRepository() {

        return misRepository;
    }

}
