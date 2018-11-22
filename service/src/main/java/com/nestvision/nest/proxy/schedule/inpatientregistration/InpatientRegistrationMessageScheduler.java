package com.nestvision.nest.proxy.schedule.inpatientregistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;
import com.nestvision.nest.proxy.fhir.service.InpatientRegistrationService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientRegistrationMessageScheduler extends AbstractMessageScheduler<InpatientRegistration> {

    @Autowired
    private InpatientRegistrationService inpatientRegistrationService;

    @Autowired
    private InpatientRegistrationMessageSender inpatientRegistrationMessageSender;
    
	@Autowired
    private InpatientRegistrationMessageValidator inpatientRegistrationMessageValidator;
    
    @Override
    protected Page<InpatientRegistration> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InpatientRegistration> query = new FhirResourceQuery<>();
        return inpatientRegistrationService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InpatientRegistration inpatientRegistration) {

        log.debug("发送消息[{}-{}],CN={}", inpatientRegistration.getClass().getSimpleName(),inpatientRegistration.getUid(), inpatientRegistration.getUpHospital());
        inpatientRegistrationMessageSender.send(inpatientRegistration);

    }
    @Override
    protected MessageValidateResult doValidate(InpatientRegistration inpatientRegistration) {

        return inpatientRegistrationMessageValidator.validate(inpatientRegistration);
    }

    @Override
    protected void doDelete(InpatientRegistration inpatientRegistration) {
        inpatientRegistrationService.delete(inpatientRegistration);

    }

}
