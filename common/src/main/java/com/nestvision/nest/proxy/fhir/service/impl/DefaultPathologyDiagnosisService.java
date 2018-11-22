package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.PathologyDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;
import com.nestvision.nest.proxy.fhir.service.PathologyDiagnosisService;

@Service
public class DefaultPathologyDiagnosisService extends AbstractBaseService<PathologyDiagnosis, String> implements PathologyDiagnosisService {

    @Autowired
    private PathologyDiagnosisRepository pathologyDiagnosisRepository;

    @Override
    protected BaseRepository<PathologyDiagnosis, String> getBaseRepository() {

        return pathologyDiagnosisRepository;
    }

}
