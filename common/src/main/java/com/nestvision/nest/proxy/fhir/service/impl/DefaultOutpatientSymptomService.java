package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientSymptomRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.OutpatientSymptomService;

@Service
public class DefaultOutpatientSymptomService extends AbstractBaseService<OutpatientSymptom, String> implements OutpatientSymptomService {

    @Autowired
    private OutpatientSymptomRepository outpatientSymptomRepository;

    @Override
    protected BaseRepository<OutpatientSymptom, String> getBaseRepository() {

        return outpatientSymptomRepository;
    }

}
