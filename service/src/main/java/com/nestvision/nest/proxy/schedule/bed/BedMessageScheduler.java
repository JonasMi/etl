package com.nestvision.nest.proxy.schedule.bed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Bed;
import com.nestvision.nest.proxy.fhir.service.BedService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BedMessageScheduler extends AbstractMessageScheduler<Bed> {

    @Autowired
    private BedService bedService;

    @Autowired
    private BedMessageSender bedMessageSender;
    
	@Autowired
    private BedMessageValidator bedMessageValidator;
    
    @Override
    protected Page<Bed> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Bed> query = new FhirResourceQuery<>();
        return bedService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Bed bed) {

        log.debug("发送消息[{}-{}],CN={}", bed.getClass().getSimpleName(),bed.getUid(), bed.getUpHospital());
        bedMessageSender.send(bed);

    }
    @Override
    protected MessageValidateResult doValidate(Bed bed) {

        return bedMessageValidator.validate(bed);
    }

    @Override
    protected void doDelete(Bed bed) {
        bedService.delete(bed);

    }

}
