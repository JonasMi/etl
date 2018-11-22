package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.DiagnosisProveRepository;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;
import com.nestvision.nest.proxy.fhir.service.DiagnosisProveService;

@Service
public class DefaultDiagnosisProveService extends AbstractBaseService<DiagnosisProve, String> implements DiagnosisProveService {

    @Autowired
    private DiagnosisProveRepository diagnosisProveRepository;

    @Override
    protected BaseRepository<DiagnosisProve, String> getBaseRepository() {

        return diagnosisProveRepository;
    }

}
