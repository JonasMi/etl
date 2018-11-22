package com.nestvision.nest.proxy.schedule.admissionrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;
import com.nestvision.nest.proxy.fhir.service.AdmissionRecordService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AdmissionRecordMessageScheduler extends AbstractMessageScheduler<AdmissionRecord> {

    @Autowired
    private AdmissionRecordService admissionRecordService;

    @Autowired
    private AdmissionRecordMessageSender admissionRecordMessageSender;
    
	@Autowired
    private AdmissionRecordMessageValidator admissionRecordMessageValidator;
    
    @Override
    protected Page<AdmissionRecord> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<AdmissionRecord> query = new FhirResourceQuery<>();
        return admissionRecordService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(AdmissionRecord admissionRecord) {

        log.debug("发送消息[{}-{}],CN={}", admissionRecord.getClass().getSimpleName(),admissionRecord.getUid(), admissionRecord.getUpHospital());
        admissionRecordMessageSender.send(admissionRecord);

    }
    @Override
    protected MessageValidateResult doValidate(AdmissionRecord admissionRecord) {

        return admissionRecordMessageValidator.validate(admissionRecord);
    }

    @Override
    protected void doDelete(AdmissionRecord admissionRecord) {
        admissionRecordService.delete(admissionRecord);

    }

}
