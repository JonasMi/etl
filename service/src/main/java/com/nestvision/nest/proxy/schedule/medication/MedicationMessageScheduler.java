package com.nestvision.nest.proxy.schedule.medication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Medication;
import com.nestvision.nest.proxy.fhir.service.MedicationService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MedicationMessageScheduler extends AbstractMessageScheduler<Medication> {

    @Autowired
    private MedicationService medicationService;

    @Autowired
    private MedicationMessageSender medicationMessageSender;
    
	@Autowired
    private MedicationMessageValidator medicationMessageValidator;
    
    @Override
    protected Page<Medication> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Medication> query = new FhirResourceQuery<>();
        return medicationService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Medication medication) {

        log.debug("发送消息[{}-{}],CN={}", medication.getClass().getSimpleName(),medication.getUid(), medication.getUpHospital());
        medicationMessageSender.send(medication);

    }
    @Override
    protected MessageValidateResult doValidate(Medication medication) {

        return medicationMessageValidator.validate(medication);
    }

    @Override
    protected void doDelete(Medication medication) {
        medicationService.delete(medication);

    }

}
