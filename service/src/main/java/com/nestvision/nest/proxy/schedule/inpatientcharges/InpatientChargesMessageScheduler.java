package com.nestvision.nest.proxy.schedule.inpatientcharges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;
import com.nestvision.nest.proxy.fhir.service.InpatientChargesService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientChargesMessageScheduler extends AbstractMessageScheduler<InpatientCharges> {

    @Autowired
    private InpatientChargesService inpatientChargesService;

    @Autowired
    private InpatientChargesMessageSender inpatientChargesMessageSender;
    
	@Autowired
    private InpatientChargesMessageValidator inpatientChargesMessageValidator;
    
    @Override
    protected Page<InpatientCharges> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InpatientCharges> query = new FhirResourceQuery<>();
        return inpatientChargesService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InpatientCharges inpatientCharges) {

        log.debug("发送消息[{}-{}],CN={}", inpatientCharges.getClass().getSimpleName(),inpatientCharges.getUid(), inpatientCharges.getUpHospital());
        inpatientChargesMessageSender.send(inpatientCharges);

    }
    @Override
    protected MessageValidateResult doValidate(InpatientCharges inpatientCharges) {

        return inpatientChargesMessageValidator.validate(inpatientCharges);
    }

    @Override
    protected void doDelete(InpatientCharges inpatientCharges) {
        inpatientChargesService.delete(inpatientCharges);

    }

}
