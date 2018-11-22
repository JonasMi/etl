package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.PatientTelecomRepository;
import com.nestvision.nest.proxy.fhir.entity.PatientTelecom;
import com.nestvision.nest.proxy.fhir.service.PatientTelecomService;

@Service
public class DefaultPatientTelecomService extends AbstractBaseService<PatientTelecom, String> implements PatientTelecomService {

    @Autowired
    private PatientTelecomRepository patientTelecomRepository;

    @Override
    protected BaseRepository<PatientTelecom, String> getBaseRepository() {

        return patientTelecomRepository;
    }

}
