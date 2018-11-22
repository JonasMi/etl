package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientChargesDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientChargesDetail;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesDetailService;

@Service
public class DefaultOutpatientChargesDetailService extends AbstractBaseService<OutpatientChargesDetail, String> implements OutpatientChargesDetailService {

    @Autowired
    private OutpatientChargesDetailRepository outpatientChargesDetailRepository;

    @Override
    protected BaseRepository<OutpatientChargesDetail, String> getBaseRepository() {

        return outpatientChargesDetailRepository;
    }

}
