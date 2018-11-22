package com.nestvision.nest.proxy.schedule.medicalrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;
import com.nestvision.nest.proxy.fhir.service.MedicalRecordService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MedicalRecordMessageScheduler extends AbstractMessageScheduler<MedicalRecord> {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @Autowired
    private MedicalRecordMessageSender medicalRecordMessageSender;
    
	@Autowired
    private MedicalRecordMessageValidator medicalRecordMessageValidator;
    
    @Override
    protected Page<MedicalRecord> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<MedicalRecord> query = new FhirResourceQuery<>();
        return medicalRecordService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(MedicalRecord medicalRecord) {

        log.debug("发送消息[{}-{}],CN={}", medicalRecord.getClass().getSimpleName(),medicalRecord.getUid(), medicalRecord.getUpHospital());
        medicalRecordMessageSender.send(medicalRecord);

    }
    @Override
    protected MessageValidateResult doValidate(MedicalRecord medicalRecord) {

        return medicalRecordMessageValidator.validate(medicalRecord);
    }

    @Override
    protected void doDelete(MedicalRecord medicalRecord) {
        medicalRecordService.delete(medicalRecord);

    }

}
