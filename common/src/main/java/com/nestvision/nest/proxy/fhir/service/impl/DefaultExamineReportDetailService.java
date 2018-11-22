package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ExamineReportDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.ExamineReportDetail;
import com.nestvision.nest.proxy.fhir.service.ExamineReportDetailService;

@Service
public class DefaultExamineReportDetailService extends AbstractBaseService<ExamineReportDetail, String> implements ExamineReportDetailService {

    @Autowired
    private ExamineReportDetailRepository examineReportDetailRepository;

    @Override
    protected BaseRepository<ExamineReportDetail, String> getBaseRepository() {

        return examineReportDetailRepository;
    }

}
