package com.nestvision.nest.proxy.schedule.examinereport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;
import com.nestvision.nest.proxy.fhir.service.ExamineReportService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExamineReportMessageScheduler extends AbstractMessageScheduler<ExamineReport> {

    @Autowired
    private ExamineReportService examineReportService;

    @Autowired
    private ExamineReportMessageSender examineReportMessageSender;
    
	@Autowired
    private ExamineReportMessageValidator examineReportMessageValidator;
    
    @Override
    protected Page<ExamineReport> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<ExamineReport> query = new FhirResourceQuery<>();
        return examineReportService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(ExamineReport examineReport) {

        log.debug("发送消息[{}-{}],CN={}", examineReport.getClass().getSimpleName(),examineReport.getUid(), examineReport.getUpHospital());
        examineReportMessageSender.send(examineReport);

    }
    @Override
    protected MessageValidateResult doValidate(ExamineReport examineReport) {

        return examineReportMessageValidator.validate(examineReport);
    }

    @Override
    protected void doDelete(ExamineReport examineReport) {
        examineReportService.delete(examineReport);

    }

}
