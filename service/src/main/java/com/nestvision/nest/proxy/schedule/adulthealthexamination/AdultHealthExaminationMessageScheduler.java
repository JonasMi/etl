package com.nestvision.nest.proxy.schedule.adulthealthexamination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;
import com.nestvision.nest.proxy.fhir.service.AdultHealthExaminationService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AdultHealthExaminationMessageScheduler extends AbstractMessageScheduler<AdultHealthExamination> {

    @Autowired
    private AdultHealthExaminationService adultHealthExaminationService;

    @Autowired
    private AdultHealthExaminationMessageSender adultHealthExaminationMessageSender;
    
	@Autowired
    private AdultHealthExaminationMessageValidator adultHealthExaminationMessageValidator;
    
    @Override
    protected Page<AdultHealthExamination> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<AdultHealthExamination> query = new FhirResourceQuery<>();
        return adultHealthExaminationService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(AdultHealthExamination adultHealthExamination) {

        log.debug("发送消息[{}-{}],CN={}", adultHealthExamination.getClass().getSimpleName(),adultHealthExamination.getUid(), adultHealthExamination.getUpHospital());
        adultHealthExaminationMessageSender.send(adultHealthExamination);

    }
    @Override
    protected MessageValidateResult doValidate(AdultHealthExamination adultHealthExamination) {

        return adultHealthExaminationMessageValidator.validate(adultHealthExamination);
    }

    @Override
    protected void doDelete(AdultHealthExamination adultHealthExamination) {
        adultHealthExaminationService.delete(adultHealthExamination);

    }

}
