package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.MedicalRecordRepository;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;
import com.nestvision.nest.proxy.fhir.service.MedicalRecordService;

@Service
public class DefaultMedicalRecordService extends AbstractBaseService<MedicalRecord, String> implements MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    @Override
    protected BaseRepository<MedicalRecord, String> getBaseRepository() {

        return medicalRecordRepository;
    }

}
