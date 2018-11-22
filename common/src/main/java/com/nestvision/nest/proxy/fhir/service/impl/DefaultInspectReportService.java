package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InspectReportRepository;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;
import com.nestvision.nest.proxy.fhir.service.InspectReportService;

@Service
public class DefaultInspectReportService extends AbstractBaseService<InspectReport, String> implements InspectReportService {

    @Autowired
    private InspectReportRepository inspectReportRepository;

    @Override
    protected BaseRepository<InspectReport, String> getBaseRepository() {

        return inspectReportRepository;
    }

}
