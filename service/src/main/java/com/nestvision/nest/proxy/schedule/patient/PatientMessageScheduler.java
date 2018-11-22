package com.nestvision.nest.proxy.schedule.patient;

import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.service.PatientService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PatientMessageScheduler extends AbstractMessageScheduler<Patient> {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientMessageSender patientMessageSender;

    @Autowired
    private PatientMessageValidator patientMessageValidator;

    @Override
    protected Page<Patient> scanOnce(int page, int size) {
        //采用ASC排序才能保证先进数据库的数据先处理
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Patient> query = new FhirResourceQuery<>();
        return patientService.findAll(query, pageable);
    }

    @Override
    protected void doSend(Patient patient) {

        log.debug("发送消息[{}-{}],CN={}", patient.getClass().getSimpleName(), patient.getUid(), patient.getUpHospital());
        patientMessageSender.send(patient);

    }

    @Override
    protected MessageValidateResult doValidate(Patient patient) {

        return patientMessageValidator.validate(patient);
    }

    @Override
    protected void doDelete(Patient patient) {
        patientService.delete(patient);

    }

}
