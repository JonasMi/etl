package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ClinictypeRepository;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;
import com.nestvision.nest.proxy.fhir.service.ClinictypeService;

@Service
public class DefaultClinictypeService extends AbstractBaseService<Clinictype, String> implements ClinictypeService {

    @Autowired
    private ClinictypeRepository clinictypeRepository;

    @Override
    protected BaseRepository<Clinictype, String> getBaseRepository() {

        return clinictypeRepository;
    }

}
