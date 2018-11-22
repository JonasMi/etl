package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InhospitalDiagnosisRepository;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;
import com.nestvision.nest.proxy.fhir.service.InhospitalDiagnosisService;

@Service
public class DefaultInhospitalDiagnosisService extends AbstractBaseService<InhospitalDiagnosis, String> implements InhospitalDiagnosisService {

    @Autowired
    private InhospitalDiagnosisRepository inhospitalDiagnosisRepository;

    @Override
    protected BaseRepository<InhospitalDiagnosis, String> getBaseRepository() {

        return inhospitalDiagnosisRepository;
    }

}
