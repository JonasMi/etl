package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientRegistrationRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.OutpatientRegistrationService;

@Service
public class DefaultOutpatientRegistrationService extends AbstractBaseService<OutpatientRegistration, String> implements OutpatientRegistrationService {

    @Autowired
    private OutpatientRegistrationRepository outpatientRegistrationRepository;

    @Override
    protected BaseRepository<OutpatientRegistration, String> getBaseRepository() {

        return outpatientRegistrationRepository;
    }

}
