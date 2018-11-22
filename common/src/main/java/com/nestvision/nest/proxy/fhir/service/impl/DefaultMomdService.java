package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MomdRepository;
import com.nestvision.nest.proxy.fhir.entity.Momd;
import com.nestvision.nest.proxy.fhir.service.MomdService;

@Service
public class DefaultMomdService extends AbstractBaseService<Momd, String> implements MomdService {

    @Autowired
    private MomdRepository momdRepository;

    @Override
    protected BaseRepository<Momd, String> getBaseRepository() {

        return momdRepository;
    }

}
