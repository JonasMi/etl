package com.nestvision.nest.proxy.schedule.outpatientcharges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.fhir.service.OutpatientChargesService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientChargesMessageScheduler extends AbstractMessageScheduler<OutpatientCharges> {

    @Autowired
    private OutpatientChargesService outpatientChargesService;

    @Autowired
    private OutpatientChargesMessageSender outpatientChargesMessageSender;
    
	@Autowired
    private OutpatientChargesMessageValidator outpatientChargesMessageValidator;
    
    @Override
    protected Page<OutpatientCharges> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientCharges> query = new FhirResourceQuery<>();
        return outpatientChargesService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientCharges outpatientCharges) {

        log.debug("发送消息[{}-{}],CN={}", outpatientCharges.getClass().getSimpleName(),outpatientCharges.getUid(), outpatientCharges.getUpHospital());
        outpatientChargesMessageSender.send(outpatientCharges);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientCharges outpatientCharges) {

        return outpatientChargesMessageValidator.validate(outpatientCharges);
    }

    @Override
    protected void doDelete(OutpatientCharges outpatientCharges) {
        outpatientChargesService.delete(outpatientCharges);

    }

}
