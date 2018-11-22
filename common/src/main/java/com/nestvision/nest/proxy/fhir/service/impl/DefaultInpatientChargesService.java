package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InpatientChargesRepository;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesService;

@Service
public class DefaultInpatientChargesService extends AbstractBaseService<InpatientCharges, String> implements InpatientChargesService {

    @Autowired
    private InpatientChargesRepository inpatientChargesRepository;

    @Override
    protected BaseRepository<InpatientCharges, String> getBaseRepository() {

        return inpatientChargesRepository;
    }

}
