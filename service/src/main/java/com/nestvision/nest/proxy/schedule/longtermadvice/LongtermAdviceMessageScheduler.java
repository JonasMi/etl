package com.nestvision.nest.proxy.schedule.longtermadvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;
import com.nestvision.nest.proxy.fhir.service.LongtermAdviceService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LongtermAdviceMessageScheduler extends AbstractMessageScheduler<LongtermAdvice> {

    @Autowired
    private LongtermAdviceService longtermAdviceService;

    @Autowired
    private LongtermAdviceMessageSender longtermAdviceMessageSender;
    
	@Autowired
    private LongtermAdviceMessageValidator longtermAdviceMessageValidator;
    
    @Override
    protected Page<LongtermAdvice> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<LongtermAdvice> query = new FhirResourceQuery<>();
        return longtermAdviceService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(LongtermAdvice longtermAdvice) {

        log.debug("发送消息[{}-{}],CN={}", longtermAdvice.getClass().getSimpleName(),longtermAdvice.getUid(), longtermAdvice.getUpHospital());
        longtermAdviceMessageSender.send(longtermAdvice);

    }
    @Override
    protected MessageValidateResult doValidate(LongtermAdvice longtermAdvice) {

        return longtermAdviceMessageValidator.validate(longtermAdvice);
    }

    @Override
    protected void doDelete(LongtermAdvice longtermAdvice) {
        longtermAdviceService.delete(longtermAdvice);

    }

}
