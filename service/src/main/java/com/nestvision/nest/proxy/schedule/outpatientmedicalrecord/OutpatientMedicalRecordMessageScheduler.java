package com.nestvision.nest.proxy.schedule.outpatientmedicalrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;
import com.nestvision.nest.proxy.fhir.service.OutpatientMedicalRecordService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientMedicalRecordMessageScheduler extends AbstractMessageScheduler<OutpatientMedicalRecord> {

    @Autowired
    private OutpatientMedicalRecordService outpatientMedicalRecordService;

    @Autowired
    private OutpatientMedicalRecordMessageSender outpatientMedicalRecordMessageSender;
    
	@Autowired
    private OutpatientMedicalRecordMessageValidator outpatientMedicalRecordMessageValidator;
    
    @Override
    protected Page<OutpatientMedicalRecord> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientMedicalRecord> query = new FhirResourceQuery<>();
        return outpatientMedicalRecordService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientMedicalRecord outpatientMedicalRecord) {

        log.debug("发送消息[{}-{}],CN={}", outpatientMedicalRecord.getClass().getSimpleName(),outpatientMedicalRecord.getUid(), outpatientMedicalRecord.getUpHospital());
        outpatientMedicalRecordMessageSender.send(outpatientMedicalRecord);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientMedicalRecord outpatientMedicalRecord) {

        return outpatientMedicalRecordMessageValidator.validate(outpatientMedicalRecord);
    }

    @Override
    protected void doDelete(OutpatientMedicalRecord outpatientMedicalRecord) {
        outpatientMedicalRecordService.delete(outpatientMedicalRecord);

    }

}
