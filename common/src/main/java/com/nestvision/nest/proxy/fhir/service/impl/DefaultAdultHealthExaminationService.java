package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.AdultHealthExaminationRepository;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;
import com.nestvision.nest.proxy.fhir.service.AdultHealthExaminationService;

@Service
public class DefaultAdultHealthExaminationService extends AbstractBaseService<AdultHealthExamination, String> implements AdultHealthExaminationService {

    @Autowired
    private AdultHealthExaminationRepository adultHealthExaminationRepository;

    @Override
    protected BaseRepository<AdultHealthExamination, String> getBaseRepository() {

        return adultHealthExaminationRepository;
    }

}
