package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OuthospitalMajorDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalMajorDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalMajorDiagnosisService;

@Service
public class DefaultOuthospitalMajorDiagnosisService extends AbstractBaseService<OuthospitalMajorDiagnosis, String> implements OuthospitalMajorDiagnosisService {

    @Autowired
    private OuthospitalMajorDiagnosisRepository outhospitalMajorDiagnosisRepository;

    @Override
    protected BaseRepository<OuthospitalMajorDiagnosis, String> getBaseRepository() {

        return outhospitalMajorDiagnosisRepository;
    }

}
