package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.PathologicalReportRepository;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;
import com.nestvision.nest.proxy.fhir.service.PathologicalReportService;

@Service
public class DefaultPathologicalReportService extends AbstractBaseService<PathologicalReport, String> implements PathologicalReportService {

    @Autowired
    private PathologicalReportRepository pathologicalReportRepository;

    @Override
    protected BaseRepository<PathologicalReport, String> getBaseRepository() {

        return pathologicalReportRepository;
    }

}
