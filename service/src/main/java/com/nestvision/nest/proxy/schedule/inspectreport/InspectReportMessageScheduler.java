package com.nestvision.nest.proxy.schedule.inspectreport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;
import com.nestvision.nest.proxy.fhir.service.InspectReportService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InspectReportMessageScheduler extends AbstractMessageScheduler<InspectReport> {

    @Autowired
    private InspectReportService inspectReportService;

    @Autowired
    private InspectReportMessageSender inspectReportMessageSender;
    
	@Autowired
    private InspectReportMessageValidator inspectReportMessageValidator;
    
    @Override
    protected Page<InspectReport> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InspectReport> query = new FhirResourceQuery<>();
        return inspectReportService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InspectReport inspectReport) {

        log.debug("发送消息[{}-{}],CN={}", inspectReport.getClass().getSimpleName(),inspectReport.getUid(), inspectReport.getUpHospital());
        inspectReportMessageSender.send(inspectReport);

    }
    @Override
    protected MessageValidateResult doValidate(InspectReport inspectReport) {

        return inspectReportMessageValidator.validate(inspectReport);
    }

    @Override
    protected void doDelete(InspectReport inspectReport) {
        inspectReportService.delete(inspectReport);

    }

}
