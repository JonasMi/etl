package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.HospitalRepository;
import com.nestvision.nest.proxy.fhir.entity.Hospital;
import com.nestvision.nest.proxy.fhir.service.HospitalService;

@Service
public class DefaultHospitalService extends AbstractBaseService<Hospital, String> implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    protected BaseRepository<Hospital, String> getBaseRepository() {

        return hospitalRepository;
    }

}
