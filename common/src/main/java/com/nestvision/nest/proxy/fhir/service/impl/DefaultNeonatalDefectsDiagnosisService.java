package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.NeonatalDefectsDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.NeonatalDefectsDiagnosis;
import com.nestvision.nest.proxy.fhir.service.NeonatalDefectsDiagnosisService;

@Service
public class DefaultNeonatalDefectsDiagnosisService extends AbstractBaseService<NeonatalDefectsDiagnosis, String> implements NeonatalDefectsDiagnosisService {

    @Autowired
    private NeonatalDefectsDiagnosisRepository neonatalDefectsDiagnosisRepository;

    @Override
    protected BaseRepository<NeonatalDefectsDiagnosis, String> getBaseRepository() {

        return neonatalDefectsDiagnosisRepository;
    }

}
