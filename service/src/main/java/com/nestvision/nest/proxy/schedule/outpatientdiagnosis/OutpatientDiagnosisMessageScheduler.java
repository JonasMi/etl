package com.nestvision.nest.proxy.schedule.outpatientdiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OutpatientDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientDiagnosisMessageScheduler extends AbstractMessageScheduler<OutpatientDiagnosis> {

    @Autowired
    private OutpatientDiagnosisService outpatientDiagnosisService;

    @Autowired
    private OutpatientDiagnosisMessageSender outpatientDiagnosisMessageSender;
    
	@Autowired
    private OutpatientDiagnosisMessageValidator outpatientDiagnosisMessageValidator;
    
    @Override
    protected Page<OutpatientDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientDiagnosis> query = new FhirResourceQuery<>();
        return outpatientDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientDiagnosis outpatientDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", outpatientDiagnosis.getClass().getSimpleName(),outpatientDiagnosis.getUid(), outpatientDiagnosis.getUpHospital());
        outpatientDiagnosisMessageSender.send(outpatientDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientDiagnosis outpatientDiagnosis) {

        return outpatientDiagnosisMessageValidator.validate(outpatientDiagnosis);
    }

    @Override
    protected void doDelete(OutpatientDiagnosis outpatientDiagnosis) {
        outpatientDiagnosisService.delete(outpatientDiagnosis);

    }

}
