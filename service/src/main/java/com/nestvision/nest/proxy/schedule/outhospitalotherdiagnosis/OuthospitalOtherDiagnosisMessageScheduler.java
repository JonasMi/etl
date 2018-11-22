package com.nestvision.nest.proxy.schedule.outhospitalotherdiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalOtherDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalOtherDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OuthospitalOtherDiagnosisMessageScheduler extends AbstractMessageScheduler<OuthospitalOtherDiagnosis> {

    @Autowired
    private OuthospitalOtherDiagnosisService outhospitalOtherDiagnosisService;

    @Autowired
    private OuthospitalOtherDiagnosisMessageSender outhospitalOtherDiagnosisMessageSender;
    
	@Autowired
    private OuthospitalOtherDiagnosisMessageValidator outhospitalOtherDiagnosisMessageValidator;
    
    @Override
    protected Page<OuthospitalOtherDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OuthospitalOtherDiagnosis> query = new FhirResourceQuery<>();
        return outhospitalOtherDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OuthospitalOtherDiagnosis outhospitalOtherDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", outhospitalOtherDiagnosis.getClass().getSimpleName(),outhospitalOtherDiagnosis.getUid(), outhospitalOtherDiagnosis.getUpHospital());
        outhospitalOtherDiagnosisMessageSender.send(outhospitalOtherDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(OuthospitalOtherDiagnosis outhospitalOtherDiagnosis) {

        return outhospitalOtherDiagnosisMessageValidator.validate(outhospitalOtherDiagnosis);
    }

    @Override
    protected void doDelete(OuthospitalOtherDiagnosis outhospitalOtherDiagnosis) {
        outhospitalOtherDiagnosisService.delete(outhospitalOtherDiagnosis);

    }

}
