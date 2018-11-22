package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InpatientChargesDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.InpatientChargesDetail;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesDetailService;

@Service
public class DefaultInpatientChargesDetailService extends AbstractBaseService<InpatientChargesDetail, String> implements InpatientChargesDetailService {

    @Autowired
    private InpatientChargesDetailRepository inpatientChargesDetailRepository;

    @Override
    protected BaseRepository<InpatientChargesDetail, String> getBaseRepository() {

        return inpatientChargesDetailRepository;
    }

}
