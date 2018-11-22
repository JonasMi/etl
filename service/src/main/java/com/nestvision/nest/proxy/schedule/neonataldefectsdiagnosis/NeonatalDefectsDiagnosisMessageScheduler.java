package com.nestvision.nest.proxy.schedule.neonataldefectsdiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.NeonatalDefectsDiagnosis;
import com.nestvision.nest.proxy.fhir.service.NeonatalDefectsDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class NeonatalDefectsDiagnosisMessageScheduler extends AbstractMessageScheduler<NeonatalDefectsDiagnosis> {

    @Autowired
    private NeonatalDefectsDiagnosisService neonatalDefectsDiagnosisService;

    @Autowired
    private NeonatalDefectsDiagnosisMessageSender neonatalDefectsDiagnosisMessageSender;
    
	@Autowired
    private NeonatalDefectsDiagnosisMessageValidator neonatalDefectsDiagnosisMessageValidator;
    
    @Override
    protected Page<NeonatalDefectsDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<NeonatalDefectsDiagnosis> query = new FhirResourceQuery<>();
        return neonatalDefectsDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(NeonatalDefectsDiagnosis neonatalDefectsDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", neonatalDefectsDiagnosis.getClass().getSimpleName(),neonatalDefectsDiagnosis.getUid(), neonatalDefectsDiagnosis.getUpHospital());
        neonatalDefectsDiagnosisMessageSender.send(neonatalDefectsDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(NeonatalDefectsDiagnosis neonatalDefectsDiagnosis) {

        return neonatalDefectsDiagnosisMessageValidator.validate(neonatalDefectsDiagnosis);
    }

    @Override
    protected void doDelete(NeonatalDefectsDiagnosis neonatalDefectsDiagnosis) {
        neonatalDefectsDiagnosisService.delete(neonatalDefectsDiagnosis);

    }

}
