package com.nestvision.nest.proxy.schedule.hcrdeathrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;
import com.nestvision.nest.proxy.fhir.service.HcrDeathRecordService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HcrDeathRecordMessageScheduler extends AbstractMessageScheduler<HcrDeathRecord> {

    @Autowired
    private HcrDeathRecordService hcrDeathRecordService;

    @Autowired
    private HcrDeathRecordMessageSender hcrDeathRecordMessageSender;
    
	@Autowired
    private HcrDeathRecordMessageValidator hcrDeathRecordMessageValidator;
    
    @Override
    protected Page<HcrDeathRecord> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<HcrDeathRecord> query = new FhirResourceQuery<>();
        return hcrDeathRecordService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(HcrDeathRecord hcrDeathRecord) {

        log.debug("发送消息[{}-{}],CN={}", hcrDeathRecord.getClass().getSimpleName(),hcrDeathRecord.getUid(), hcrDeathRecord.getUpHospital());
        hcrDeathRecordMessageSender.send(hcrDeathRecord);

    }
    @Override
    protected MessageValidateResult doValidate(HcrDeathRecord hcrDeathRecord) {

        return hcrDeathRecordMessageValidator.validate(hcrDeathRecord);
    }

    @Override
    protected void doDelete(HcrDeathRecord hcrDeathRecord) {
        hcrDeathRecordService.delete(hcrDeathRecord);

    }

}
