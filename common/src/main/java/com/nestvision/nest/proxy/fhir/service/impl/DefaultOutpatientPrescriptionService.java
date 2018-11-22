package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientPrescriptionRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionService;

@Service
public class DefaultOutpatientPrescriptionService extends AbstractBaseService<OutpatientPrescription, String> implements OutpatientPrescriptionService {

    @Autowired
    private OutpatientPrescriptionRepository outpatientPrescriptionRepository;

    @Override
    protected BaseRepository<OutpatientPrescription, String> getBaseRepository() {

        return outpatientPrescriptionRepository;
    }

}
