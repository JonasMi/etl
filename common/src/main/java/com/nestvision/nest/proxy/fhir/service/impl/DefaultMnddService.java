package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MnddRepository;
import com.nestvision.nest.proxy.fhir.entity.Mndd;
import com.nestvision.nest.proxy.fhir.service.MnddService;

@Service
public class DefaultMnddService extends AbstractBaseService<Mndd, String> implements MnddService {

    @Autowired
    private MnddRepository mnddRepository;

    @Override
    protected BaseRepository<Mndd, String> getBaseRepository() {

        return mnddRepository;
    }

}
