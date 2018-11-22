package com.nestvision.nest.proxy.schedule.outhospitalmajordiagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalMajorDiagnosis;
import com.nestvision.nest.proxy.fhir.service.OuthospitalMajorDiagnosisService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OuthospitalMajorDiagnosisMessageScheduler extends AbstractMessageScheduler<OuthospitalMajorDiagnosis> {

    @Autowired
    private OuthospitalMajorDiagnosisService outhospitalMajorDiagnosisService;

    @Autowired
    private OuthospitalMajorDiagnosisMessageSender outhospitalMajorDiagnosisMessageSender;
    
	@Autowired
    private OuthospitalMajorDiagnosisMessageValidator outhospitalMajorDiagnosisMessageValidator;
    
    @Override
    protected Page<OuthospitalMajorDiagnosis> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OuthospitalMajorDiagnosis> query = new FhirResourceQuery<>();
        return outhospitalMajorDiagnosisService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OuthospitalMajorDiagnosis outhospitalMajorDiagnosis) {

        log.debug("发送消息[{}-{}],CN={}", outhospitalMajorDiagnosis.getClass().getSimpleName(),outhospitalMajorDiagnosis.getUid(), outhospitalMajorDiagnosis.getUpHospital());
        outhospitalMajorDiagnosisMessageSender.send(outhospitalMajorDiagnosis);

    }
    @Override
    protected MessageValidateResult doValidate(OuthospitalMajorDiagnosis outhospitalMajorDiagnosis) {

        return outhospitalMajorDiagnosisMessageValidator.validate(outhospitalMajorDiagnosis);
    }

    @Override
    protected void doDelete(OuthospitalMajorDiagnosis outhospitalMajorDiagnosis) {
        outhospitalMajorDiagnosisService.delete(outhospitalMajorDiagnosis);

    }

}
