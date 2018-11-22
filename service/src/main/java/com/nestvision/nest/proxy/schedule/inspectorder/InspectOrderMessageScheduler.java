package com.nestvision.nest.proxy.schedule.inspectorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;
import com.nestvision.nest.proxy.fhir.service.InspectOrderService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InspectOrderMessageScheduler extends AbstractMessageScheduler<InspectOrder> {

    @Autowired
    private InspectOrderService inspectOrderService;

    @Autowired
    private InspectOrderMessageSender inspectOrderMessageSender;
    
	@Autowired
    private InspectOrderMessageValidator inspectOrderMessageValidator;
    
    @Override
    protected Page<InspectOrder> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InspectOrder> query = new FhirResourceQuery<>();
        return inspectOrderService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InspectOrder inspectOrder) {

        log.debug("发送消息[{}-{}],CN={}", inspectOrder.getClass().getSimpleName(),inspectOrder.getUid(), inspectOrder.getUpHospital());
        inspectOrderMessageSender.send(inspectOrder);

    }
    @Override
    protected MessageValidateResult doValidate(InspectOrder inspectOrder) {

        return inspectOrderMessageValidator.validate(inspectOrder);
    }

    @Override
    protected void doDelete(InspectOrder inspectOrder) {
        inspectOrderService.delete(inspectOrder);

    }

}
