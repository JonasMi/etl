package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientChargesRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesService;

@Service
public class DefaultOutpatientChargesService extends AbstractBaseService<OutpatientCharges, String> implements OutpatientChargesService {

    @Autowired
    private OutpatientChargesRepository outpatientChargesRepository;

    @Override
    protected BaseRepository<OutpatientCharges, String> getBaseRepository() {

        return outpatientChargesRepository;
    }

}
