package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MrRepository;
import com.nestvision.nest.proxy.fhir.entity.Mr;
import com.nestvision.nest.proxy.fhir.service.MrService;

@Service
public class DefaultMrService extends AbstractBaseService<Mr, String> implements MrService {

    @Autowired
    private MrRepository mrRepository;

    @Override
    protected BaseRepository<Mr, String> getBaseRepository() {

        return mrRepository;
    }

}
