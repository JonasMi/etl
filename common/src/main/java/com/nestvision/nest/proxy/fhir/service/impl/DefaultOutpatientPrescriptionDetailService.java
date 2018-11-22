package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientPrescriptionDetailRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescriptionDetail;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionDetailService;

@Service
public class DefaultOutpatientPrescriptionDetailService extends AbstractBaseService<OutpatientPrescriptionDetail, String> implements OutpatientPrescriptionDetailService {

    @Autowired
    private OutpatientPrescriptionDetailRepository outpatientPrescriptionDetailRepository;

    @Override
    protected BaseRepository<OutpatientPrescriptionDetail, String> getBaseRepository() {

        return outpatientPrescriptionDetailRepository;
    }

}
