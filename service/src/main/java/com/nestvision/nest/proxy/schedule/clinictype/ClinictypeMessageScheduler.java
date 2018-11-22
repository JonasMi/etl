package com.nestvision.nest.proxy.schedule.clinictype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;
import com.nestvision.nest.proxy.fhir.service.ClinictypeService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClinictypeMessageScheduler extends AbstractMessageScheduler<Clinictype> {

    @Autowired
    private ClinictypeService clinictypeService;

    @Autowired
    private ClinictypeMessageSender clinictypeMessageSender;
    
	@Autowired
    private ClinictypeMessageValidator clinictypeMessageValidator;
    
    @Override
    protected Page<Clinictype> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Clinictype> query = new FhirResourceQuery<>();
        return clinictypeService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Clinictype clinictype) {

        log.debug("发送消息[{}-{}],CN={}", clinictype.getClass().getSimpleName(),clinictype.getUid(), clinictype.getUpHospital());
        clinictypeMessageSender.send(clinictype);

    }
    @Override
    protected MessageValidateResult doValidate(Clinictype clinictype) {

        return clinictypeMessageValidator.validate(clinictype);
    }

    @Override
    protected void doDelete(Clinictype clinictype) {
        clinictypeService.delete(clinictype);

    }

}
