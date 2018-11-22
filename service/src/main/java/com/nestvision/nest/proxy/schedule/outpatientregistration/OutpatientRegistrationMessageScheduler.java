package com.nestvision.nest.proxy.schedule.outpatientregistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.OutpatientRegistrationService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientRegistrationMessageScheduler extends AbstractMessageScheduler<OutpatientRegistration> {

    @Autowired
    private OutpatientRegistrationService outpatientRegistrationService;

    @Autowired
    private OutpatientRegistrationMessageSender outpatientRegistrationMessageSender;
    
	@Autowired
    private OutpatientRegistrationMessageValidator outpatientRegistrationMessageValidator;
    
    @Override
    protected Page<OutpatientRegistration> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientRegistration> query = new FhirResourceQuery<>();
        return outpatientRegistrationService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientRegistration outpatientRegistration) {

        log.debug("发送消息[{}-{}],CN={}", outpatientRegistration.getClass().getSimpleName(),outpatientRegistration.getUid(), outpatientRegistration.getUpHospital());
        outpatientRegistrationMessageSender.send(outpatientRegistration);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientRegistration outpatientRegistration) {

        return outpatientRegistrationMessageValidator.validate(outpatientRegistration);
    }

    @Override
    protected void doDelete(OutpatientRegistration outpatientRegistration) {
        outpatientRegistrationService.delete(outpatientRegistration);

    }

}
