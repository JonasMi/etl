package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.AppointmentRepository;
import com.nestvision.nest.proxy.fhir.entity.Appointment;
import com.nestvision.nest.proxy.fhir.service.AppointmentService;

@Service
public class DefaultAppointmentService extends AbstractBaseService<Appointment, String> implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    protected BaseRepository<Appointment, String> getBaseRepository() {

        return appointmentRepository;
    }

}
