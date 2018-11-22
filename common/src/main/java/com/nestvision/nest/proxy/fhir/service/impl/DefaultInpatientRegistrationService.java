package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InpatientRegistrationRepository;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.InpatientRegistrationService;

@Service
public class DefaultInpatientRegistrationService extends AbstractBaseService<InpatientRegistration, String> implements InpatientRegistrationService {

    @Autowired
    private InpatientRegistrationRepository inpatientRegistrationRepository;

    @Override
    protected BaseRepository<InpatientRegistration, String> getBaseRepository() {

        return inpatientRegistrationRepository;
    }

}
