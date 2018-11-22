package com.nestvision.nest.proxy.nest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.nest.dao.DataQuaityReportInvalidColumnRepository;
import com.nestvision.nest.proxy.nest.entity.DataQuaityReportInvalidColumn;
import com.nestvision.nest.proxy.nest.service.DataQuaityReportInvalidColumnService;

@Service
@Transactional
public class DefaultDataQuaityReportInvalidColumnService extends AbstractBaseService<DataQuaityReportInvalidColumn, String>
                implements DataQuaityReportInvalidColumnService {
    @Autowired
    DataQuaityReportInvalidColumnRepository dataQuaityReportInvalidColumnRepository;

    @Override
    protected BaseRepository<DataQuaityReportInvalidColumn, String> getBaseRepository() {
        return dataQuaityReportInvalidColumnRepository;
    }

}
