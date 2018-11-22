package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.BedRepository;
import com.nestvision.nest.proxy.fhir.entity.Bed;
import com.nestvision.nest.proxy.fhir.service.BedService;

@Service
public class DefaultBedService extends AbstractBaseService<Bed, String> implements BedService {

    @Autowired
    private BedRepository bedRepository;

    @Override
    protected BaseRepository<Bed, String> getBaseRepository() {

        return bedRepository;
    }

}
