package com.nestvision.nest.proxy.schedule.chargingitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;
import com.nestvision.nest.proxy.fhir.service.ChargingItemService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ChargingItemMessageScheduler extends AbstractMessageScheduler<ChargingItem> {

    @Autowired
    private ChargingItemService chargingItemService;

    @Autowired
    private ChargingItemMessageSender chargingItemMessageSender;
    
	@Autowired
    private ChargingItemMessageValidator chargingItemMessageValidator;
    
    @Override
    protected Page<ChargingItem> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<ChargingItem> query = new FhirResourceQuery<>();
        return chargingItemService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(ChargingItem chargingItem) {

        log.debug("发送消息[{}-{}],CN={}", chargingItem.getClass().getSimpleName(),chargingItem.getUid(), chargingItem.getUpHospital());
        chargingItemMessageSender.send(chargingItem);

    }
    @Override
    protected MessageValidateResult doValidate(ChargingItem chargingItem) {

        return chargingItemMessageValidator.validate(chargingItem);
    }

    @Override
    protected void doDelete(ChargingItem chargingItem) {
        chargingItemService.delete(chargingItem);

    }

}
