package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InInjuryExternalCauseRepository;
import com.nestvision.nest.proxy.fhir.entity.InInjuryExternalCause;
import com.nestvision.nest.proxy.fhir.service.InInjuryExternalCauseService;

@Service
public class DefaultInInjuryExternalCauseService extends AbstractBaseService<InInjuryExternalCause, String> implements InInjuryExternalCauseService {

    @Autowired
    private InInjuryExternalCauseRepository inInjuryExternalCauseRepository;

    @Override
    protected BaseRepository<InInjuryExternalCause, String> getBaseRepository() {

        return inInjuryExternalCauseRepository;
    }

}
