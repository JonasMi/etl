package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ExamineSpecimenRepository;
import com.nestvision.nest.proxy.fhir.entity.ExamineSpecimen;
import com.nestvision.nest.proxy.fhir.service.ExamineSpecimenService;

@Service
public class DefaultExamineSpecimenService extends AbstractBaseService<ExamineSpecimen, String> implements ExamineSpecimenService {

    @Autowired
    private ExamineSpecimenRepository examineSpecimenRepository;

    @Override
    protected BaseRepository<ExamineSpecimen, String> getBaseRepository() {

        return examineSpecimenRepository;
    }

}
