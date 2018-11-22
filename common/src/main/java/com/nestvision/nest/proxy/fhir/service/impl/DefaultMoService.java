package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MoRepository;
import com.nestvision.nest.proxy.fhir.entity.Mo;
import com.nestvision.nest.proxy.fhir.service.MoService;

@Service
public class DefaultMoService extends AbstractBaseService<Mo, String> implements MoService {

    @Autowired
    private MoRepository moRepository;

    @Override
    protected BaseRepository<Mo, String> getBaseRepository() {

        return moRepository;
    }

}
