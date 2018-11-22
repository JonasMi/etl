package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OuthospitalOtherDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalOtherDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalOtherDiagnosisService;

@Service
public class DefaultOuthospitalOtherDiagnosisService extends AbstractBaseService<OuthospitalOtherDiagnosis, String> implements OuthospitalOtherDiagnosisService {

    @Autowired
    private OuthospitalOtherDiagnosisRepository outhospitalOtherDiagnosisRepository;

    @Override
    protected BaseRepository<OuthospitalOtherDiagnosis, String> getBaseRepository() {

        return outhospitalOtherDiagnosisRepository;
    }

}
