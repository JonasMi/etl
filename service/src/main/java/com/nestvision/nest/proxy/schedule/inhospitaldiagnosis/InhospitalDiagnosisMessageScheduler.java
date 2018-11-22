package com.nestvision.nest.proxy.schedule.inhospitaldiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;
import com.nestvision.nest.proxy.fhir.service.InhospitalDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InhospitalDiagnosisMessageScheduler extends AbstractMessageScheduler<InhospitalDiagnosis> {

    @Autowired
    private InhospitalDiagnosisService inhospitalDiagnosisService;

    @Autowired
    private InhospitalDiagnosisMessageSender inhospitalDiagnosisMessageSender;
    
	@Autowired
    private InhospitalDiagnosisMessageValidator inhospitalDiagnosisMessageValidator;
    
    @Override
    protected Page<InhospitalDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InhospitalDiagnosis> query = new FhirResourceQuery<>();
        return inhospitalDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InhospitalDiagnosis inhospitalDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", inhospitalDiagnosis.getClass().getSimpleName(),inhospitalDiagnosis.getUid(), inhospitalDiagnosis.getUpHospital());
        inhospitalDiagnosisMessageSender.send(inhospitalDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(InhospitalDiagnosis inhospitalDiagnosis) {

        return inhospitalDiagnosisMessageValidator.validate(inhospitalDiagnosis);
    }

    @Override
    protected void doDelete(InhospitalDiagnosis inhospitalDiagnosis) {
        inhospitalDiagnosisService.delete(inhospitalDiagnosis);

    }

}
