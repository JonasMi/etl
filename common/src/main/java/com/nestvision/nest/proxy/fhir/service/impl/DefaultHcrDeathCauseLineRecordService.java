package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.HcrDeathCauseLineRecordRepository;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathCauseLineRecord;
import com.nestvision.nest.proxy.fhir.service.HcrDeathCauseLineRecordService;

@Service
public class DefaultHcrDeathCauseLineRecordService extends AbstractBaseService<HcrDeathCauseLineRecord, String> implements HcrDeathCauseLineRecordService {

    @Autowired
    private HcrDeathCauseLineRecordRepository hcrDeathCauseLineRecordRepository;

    @Override
    protected BaseRepository<HcrDeathCauseLineRecord, String> getBaseRepository() {

        return hcrDeathCauseLineRecordRepository;
    }

}
