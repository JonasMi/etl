package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ExamineMediaRepository;
import com.nestvision.nest.proxy.fhir.entity.ExamineMedia;
import com.nestvision.nest.proxy.fhir.service.ExamineMediaService;

@Service
public class DefaultExamineMediaService extends AbstractBaseService<ExamineMedia, String> implements ExamineMediaService {

    @Autowired
    private ExamineMediaRepository examineMediaRepository;

    @Override
    protected BaseRepository<ExamineMedia, String> getBaseRepository() {

        return examineMediaRepository;
    }

}
