package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MiiedRepository;
import com.nestvision.nest.proxy.fhir.entity.Miied;
import com.nestvision.nest.proxy.fhir.service.MiiedService;

@Service
public class DefaultMiiedService extends AbstractBaseService<Miied, String> implements MiiedService {

    @Autowired
    private MiiedRepository miiedRepository;

    @Override
    protected BaseRepository<Miied, String> getBaseRepository() {

        return miiedRepository;
    }

}
