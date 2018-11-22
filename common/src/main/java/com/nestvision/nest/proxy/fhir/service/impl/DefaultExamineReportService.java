package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ExamineReportRepository;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;
import com.nestvision.nest.proxy.fhir.service.ExamineReportService;

@Service
public class DefaultExamineReportService extends AbstractBaseService<ExamineReport, String> implements ExamineReportService {

    @Autowired
    private ExamineReportRepository examineReportRepository;

    @Override
    protected BaseRepository<ExamineReport, String> getBaseRepository() {

        return examineReportRepository;
    }

}
