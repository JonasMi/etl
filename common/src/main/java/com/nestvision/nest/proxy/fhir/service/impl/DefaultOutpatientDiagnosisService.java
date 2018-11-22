package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OutpatientDiagnosisService;

@Service
public class DefaultOutpatientDiagnosisService extends AbstractBaseService<OutpatientDiagnosis, String> implements OutpatientDiagnosisService {

    @Autowired
    private OutpatientDiagnosisRepository outpatientDiagnosisRepository;

    @Override
    protected BaseRepository<OutpatientDiagnosis, String> getBaseRepository() {

        return outpatientDiagnosisRepository;
    }

}
