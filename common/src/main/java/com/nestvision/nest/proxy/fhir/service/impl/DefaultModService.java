package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ModRepository;
import com.nestvision.nest.proxy.fhir.entity.Mod;
import com.nestvision.nest.proxy.fhir.service.ModService;

@Service
public class DefaultModService extends AbstractBaseService<Mod, String> implements ModService {

    @Autowired
    private ModRepository modRepository;

    @Override
    protected BaseRepository<Mod, String> getBaseRepository() {

        return modRepository;
    }

}
