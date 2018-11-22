package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientChargesPayDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientChargesPayDetail;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesPayDetailService;

@Service
public class DefaultOutpatientChargesPayDetailService extends AbstractBaseService<OutpatientChargesPayDetail, String> implements OutpatientChargesPayDetailService {

    @Autowired
    private OutpatientChargesPayDetailRepository outpatientChargesPayDetailRepository;

    @Override
    protected BaseRepository<OutpatientChargesPayDetail, String> getBaseRepository() {

        return outpatientChargesPayDetailRepository;
    }

}
