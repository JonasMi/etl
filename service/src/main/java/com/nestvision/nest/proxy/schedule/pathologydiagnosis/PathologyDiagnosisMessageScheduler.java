package com.nestvision.nest.proxy.schedule.pathologydiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;
import com.nestvision.nest.proxy.fhir.service.PathologyDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PathologyDiagnosisMessageScheduler extends AbstractMessageScheduler<PathologyDiagnosis> {

    @Autowired
    private PathologyDiagnosisService pathologyDiagnosisService;

    @Autowired
    private PathologyDiagnosisMessageSender pathologyDiagnosisMessageSender;
    
	@Autowired
    private PathologyDiagnosisMessageValidator pathologyDiagnosisMessageValidator;
    
    @Override
    protected Page<PathologyDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<PathologyDiagnosis> query = new FhirResourceQuery<>();
        return pathologyDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(PathologyDiagnosis pathologyDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", pathologyDiagnosis.getClass().getSimpleName(),pathologyDiagnosis.getUid(), pathologyDiagnosis.getUpHospital());
        pathologyDiagnosisMessageSender.send(pathologyDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(PathologyDiagnosis pathologyDiagnosis) {

        return pathologyDiagnosisMessageValidator.validate(pathologyDiagnosis);
    }

    @Override
    protected void doDelete(PathologyDiagnosis pathologyDiagnosis) {
        pathologyDiagnosisService.delete(pathologyDiagnosis);

    }

}
