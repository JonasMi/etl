package com.nestvision.nest.proxy.schedule.appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Appointment;
import com.nestvision.nest.proxy.fhir.service.AppointmentService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppointmentMessageScheduler extends AbstractMessageScheduler<Appointment> {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentMessageSender appointmentMessageSender;
    
	@Autowired
    private AppointmentMessageValidator appointmentMessageValidator;
    
    @Override
    protected Page<Appointment> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Appointment> query = new FhirResourceQuery<>();
        return appointmentService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Appointment appointment) {

        log.debug("发送消息[{}-{}],CN={}", appointment.getClass().getSimpleName(),appointment.getUid(), appointment.getUpHospital());
        appointmentMessageSender.send(appointment);

    }
    @Override
    protected MessageValidateResult doValidate(Appointment appointment) {

        return appointmentMessageValidator.validate(appointment);
    }

    @Override
    protected void doDelete(Appointment appointment) {
        appointmentService.delete(appointment);

    }

}
