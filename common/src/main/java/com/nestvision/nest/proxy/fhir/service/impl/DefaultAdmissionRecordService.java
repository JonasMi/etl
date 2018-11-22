package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.AdmissionRecordRepository;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;
import com.nestvision.nest.proxy.fhir.service.AdmissionRecordService;

@Service
public class DefaultAdmissionRecordService extends AbstractBaseService<AdmissionRecord, String> implements AdmissionRecordService {

    @Autowired
    private AdmissionRecordRepository admissionRecordRepository;

    @Override
    protected BaseRepository<AdmissionRecord, String> getBaseRepository() {

        return admissionRecordRepository;
    }

}
