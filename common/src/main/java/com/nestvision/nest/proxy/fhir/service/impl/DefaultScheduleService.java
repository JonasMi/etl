package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.ScheduleRepository;
import com.nestvision.nest.proxy.fhir.entity.Schedule;
import com.nestvision.nest.proxy.fhir.service.ScheduleService;

@Service
public class DefaultScheduleService extends AbstractBaseService<Schedule, String> implements ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Override
    protected BaseRepository<Schedule, String> getBaseRepository() {

        return scheduleRepository;
    }

}
