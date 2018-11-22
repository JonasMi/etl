package com.nestvision.nest.proxy.schedule.dischargesummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;
import com.nestvision.nest.proxy.fhir.service.DischargeSummaryService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DischargeSummaryMessageScheduler extends AbstractMessageScheduler<DischargeSummary> {

    @Autowired
    private DischargeSummaryService dischargeSummaryService;

    @Autowired
    private DischargeSummaryMessageSender dischargeSummaryMessageSender;
    
	@Autowired
    private DischargeSummaryMessageValidator dischargeSummaryMessageValidator;
    
    @Override
    protected Page<DischargeSummary> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<DischargeSummary> query = new FhirResourceQuery<>();
        return dischargeSummaryService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(DischargeSummary dischargeSummary) {

        log.debug("发送消息[{}-{}],CN={}", dischargeSummary.getClass().getSimpleName(),dischargeSummary.getUid(), dischargeSummary.getUpHospital());
        dischargeSummaryMessageSender.send(dischargeSummary);

    }
    @Override
    protected MessageValidateResult doValidate(DischargeSummary dischargeSummary) {

        return dischargeSummaryMessageValidator.validate(dischargeSummary);
    }

    @Override
    protected void doDelete(DischargeSummary dischargeSummary) {
        dischargeSummaryService.delete(dischargeSummary);

    }

}
