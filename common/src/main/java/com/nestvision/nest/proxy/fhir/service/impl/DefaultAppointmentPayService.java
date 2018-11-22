package com.nestvision.nest.proxy.fhir.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestvision.nest.proxy.base.dao.BaseRepository;
import com.nestvision.nest.proxy.base.service.AbstractBaseService;
import com.nestvision.nest.proxy.fhir.dao.AppointmentPayRepository;
import com.nestvision.nest.proxy.fhir.entity.AppointmentPay;
import com.nestvision.nest.proxy.fhir.service.AppointmentPayService;

@Service
public class DefaultAppointmentPayService extends AbstractBaseService<AppointmentPay, String> implements AppointmentPayService {

    @Autowired
    private AppointmentPayRepository appointmentPayRepository;

    @Override
    protected BaseRepository<AppointmentPay, String> getBaseRepository() {

        return appointmentPayRepository;
    }

}
