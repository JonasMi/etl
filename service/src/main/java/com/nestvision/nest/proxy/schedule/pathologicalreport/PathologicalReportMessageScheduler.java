package com.nestvision.nest.proxy.schedule.pathologicalreport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;
import com.nestvision.nest.proxy.fhir.service.PathologicalReportService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PathologicalReportMessageScheduler extends AbstractMessageScheduler<PathologicalReport> {

    @Autowired
    private PathologicalReportService pathologicalReportService;

    @Autowired
    private PathologicalReportMessageSender pathologicalReportMessageSender;
    
	@Autowired
    private PathologicalReportMessageValidator pathologicalReportMessageValidator;
    
    @Override
    protected Page<PathologicalReport> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<PathologicalReport> query = new FhirResourceQuery<>();
        return pathologicalReportService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(PathologicalReport pathologicalReport) {

        log.debug("发送消息[{}-{}],CN={}", pathologicalReport.getClass().getSimpleName(),pathologicalReport.getUid(), pathologicalReport.getUpHospital());
        pathologicalReportMessageSender.send(pathologicalReport);

    }
    @Override
    protected MessageValidateResult doValidate(PathologicalReport pathologicalReport) {

        return pathologicalReportMessageValidator.validate(pathologicalReport);
    }

    @Override
    protected void doDelete(PathologicalReport pathologicalReport) {
        pathologicalReportService.delete(pathologicalReport);

    }

}
