package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.InpatientChargesPayDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.InpatientChargesPayDetail;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesPayDetailService;

@Service
public class DefaultInpatientChargesPayDetailService extends AbstractBaseService<InpatientChargesPayDetail, String> implements InpatientChargesPayDetailService {

    @Autowired
    private InpatientChargesPayDetailRepository inpatientChargesPayDetailRepository;

    @Override
    protected BaseRepository<InpatientChargesPayDetail, String> getBaseRepository() {

        return inpatientChargesPayDetailRepository;
    }

}
