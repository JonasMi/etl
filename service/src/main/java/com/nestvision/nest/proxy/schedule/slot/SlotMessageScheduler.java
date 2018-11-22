package com.nestvision.nest.proxy.schedule.slot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Slot;
import com.nestvision.nest.proxy.fhir.service.SlotService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SlotMessageScheduler extends AbstractMessageScheduler<Slot> {

    @Autowired
    private SlotService slotService;

    @Autowired
    private SlotMessageSender slotMessageSender;
    
	@Autowired
    private SlotMessageValidator slotMessageValidator;
    
    @Override
    protected Page<Slot> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Slot> query = new FhirResourceQuery<>();
        return slotService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Slot slot) {

        log.debug("发送消息[{}-{}],CN={}", slot.getClass().getSimpleName(),slot.getUid(), slot.getUpHospital());
        slotMessageSender.send(slot);

    }
    @Override
    protected MessageValidateResult doValidate(Slot slot) {

        return slotMessageValidator.validate(slot);
    }

    @Override
    protected void doDelete(Slot slot) {
        slotService.delete(slot);

    }

}
