package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InpatientSymptomRepository;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.InpatientSymptomService;

@Service
public class DefaultInpatientSymptomService extends AbstractBaseService<InpatientSymptom, String> implements InpatientSymptomService {

    @Autowired
    private InpatientSymptomRepository inpatientSymptomRepository;

    @Override
    protected BaseRepository<InpatientSymptom, String> getBaseRepository() {

        return inpatientSymptomRepository;
    }

}
