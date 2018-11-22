package com.nestvision.nest.proxy.schedule.ininjuryexternalcause;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InInjuryExternalCause;
import com.nestvision.nest.proxy.fhir.service.InInjuryExternalCauseService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InInjuryExternalCauseMessageScheduler extends AbstractMessageScheduler<InInjuryExternalCause> {

    @Autowired
    private InInjuryExternalCauseService inInjuryExternalCauseService;

    @Autowired
    private InInjuryExternalCauseMessageSender inInjuryExternalCauseMessageSender;
    
	@Autowired
    private InInjuryExternalCauseMessageValidator inInjuryExternalCauseMessageValidator;
    
    @Override
    protected Page<InInjuryExternalCause> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InInjuryExternalCause> query = new FhirResourceQuery<>();
        return inInjuryExternalCauseService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InInjuryExternalCause inInjuryExternalCause) {

        log.debug("发送消息[{}-{}],CN={}", inInjuryExternalCause.getClass().getSimpleName(),inInjuryExternalCause.getUid(), inInjuryExternalCause.getUpHospital());
        inInjuryExternalCauseMessageSender.send(inInjuryExternalCause);

    }
    @Override
    protected MessageValidateResult doValidate(InInjuryExternalCause inInjuryExternalCause) {

        return inInjuryExternalCauseMessageValidator.validate(inInjuryExternalCause);
    }

    @Override
    protected void doDelete(InInjuryExternalCause inInjuryExternalCause) {
        inInjuryExternalCauseService.delete(inInjuryExternalCause);

    }

}
