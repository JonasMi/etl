package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.HcrDeathRecordRepository;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;
import com.nestvision.nest.proxy.fhir.service.HcrDeathRecordService;

@Service
public class DefaultHcrDeathRecordService extends AbstractBaseService<HcrDeathRecord, String> implements HcrDeathRecordService {

    @Autowired
    private HcrDeathRecordRepository hcrDeathRecordRepository;

    @Override
    protected BaseRepository<HcrDeathRecord, String> getBaseRepository() {

        return hcrDeathRecordRepository;
    }

}
