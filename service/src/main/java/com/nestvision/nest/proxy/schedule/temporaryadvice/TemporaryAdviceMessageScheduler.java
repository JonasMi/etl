package com.nestvision.nest.proxy.schedule.temporaryadvice;

import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.service.TemporaryAdviceService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TemporaryAdviceMessageScheduler extends AbstractMessageScheduler<TemporaryAdvice> {

    @Autowired
    private TemporaryAdviceService temporaryAdviceService;

    @Autowired
    private TemporaryAdviceMessageSender temporaryAdviceMessageSender;

    @Autowired
    private TemporaryAdviceMessageValidator temporaryAdviceMessageValidator;

    @Override
    protected Page<TemporaryAdvice> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<TemporaryAdvice> query = new FhirResourceQuery<>();
        return temporaryAdviceService.findAll(query, pageable);
    }

    @Override
    protected void doSend(TemporaryAdvice temporaryAdvice) {

        log.debug("发送消息[{}-{}],CN={}", temporaryAdvice.getClass().getSimpleName(), temporaryAdvice.getUid(), temporaryAdvice.getUpHospital());
        temporaryAdviceMessageSender.send(temporaryAdvice);

    }

    @Override
    protected MessageValidateResult doValidate(TemporaryAdvice temporaryAdvice) {

        return temporaryAdviceMessageValidator.validate(temporaryAdvice);
    }

    @Override
    protected void doDelete(TemporaryAdvice temporaryAdvice) {
        temporaryAdviceService.delete(temporaryAdvice);

    }

}
