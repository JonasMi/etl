package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.DischargeSummaryRepository;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;
import com.nestvision.nest.proxy.fhir.service.DischargeSummaryService;

@Service
public class DefaultDischargeSummaryService extends AbstractBaseService<DischargeSummary, String> implements DischargeSummaryService {

    @Autowired
    private DischargeSummaryRepository dischargeSummaryRepository;

    @Override
    protected BaseRepository<DischargeSummary, String> getBaseRepository() {

        return dischargeSummaryRepository;
    }

}
