package com.nestvision.nest.proxy.schedule.diagnosisprove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;
import com.nestvision.nest.proxy.fhir.service.DiagnosisProveService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DiagnosisProveMessageScheduler extends AbstractMessageScheduler<DiagnosisProve> {

    @Autowired
    private DiagnosisProveService diagnosisProveService;

    @Autowired
    private DiagnosisProveMessageSender diagnosisProveMessageSender;
    
	@Autowired
    private DiagnosisProveMessageValidator diagnosisProveMessageValidator;
    
    @Override
    protected Page<DiagnosisProve> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<DiagnosisProve> query = new FhirResourceQuery<>();
        return diagnosisProveService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(DiagnosisProve diagnosisProve) {

        log.debug("发送消息[{}-{}],CN={}", diagnosisProve.getClass().getSimpleName(),diagnosisProve.getUid(), diagnosisProve.getUpHospital());
        diagnosisProveMessageSender.send(diagnosisProve);

    }
    @Override
    protected MessageValidateResult doValidate(DiagnosisProve diagnosisProve) {

        return diagnosisProveMessageValidator.validate(diagnosisProve);
    }

    @Override
    protected void doDelete(DiagnosisProve diagnosisProve) {
        diagnosisProveService.delete(diagnosisProve);

    }

}
