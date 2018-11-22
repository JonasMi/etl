package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.OutpatientMedicalRecordRepository;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;
import com.nestvision.nest.proxy.fhir.service.OutpatientMedicalRecordService;

@Service
public class DefaultOutpatientMedicalRecordService extends AbstractBaseService<OutpatientMedicalRecord, String> implements OutpatientMedicalRecordService {

    @Autowired
    private OutpatientMedicalRecordRepository outpatientMedicalRecordRepository;

    @Override
    protected BaseRepository<OutpatientMedicalRecord, String> getBaseRepository() {

        return outpatientMedicalRecordRepository;
    }

}
