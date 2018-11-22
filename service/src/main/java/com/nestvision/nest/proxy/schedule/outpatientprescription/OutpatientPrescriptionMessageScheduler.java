package com.nestvision.nest.proxy.schedule.outpatientprescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.fhir.service.OutpatientPrescriptionService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientPrescriptionMessageScheduler extends AbstractMessageScheduler<OutpatientPrescription> {

    @Autowired
    private OutpatientPrescriptionService outpatientPrescriptionService;

    @Autowired
    private OutpatientPrescriptionMessageSender outpatientPrescriptionMessageSender;
    
	@Autowired
    private OutpatientPrescriptionMessageValidator outpatientPrescriptionMessageValidator;
    
    @Override
    protected Page<OutpatientPrescription> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientPrescription> query = new FhirResourceQuery<>();
        return outpatientPrescriptionService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientPrescription outpatientPrescription) {

        log.debug("发送消息[{}-{}],CN={}", outpatientPrescription.getClass().getSimpleName(),outpatientPrescription.getUid(), outpatientPrescription.getUpHospital());
        outpatientPrescriptionMessageSender.send(outpatientPrescription);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientPrescription outpatientPrescription) {

        return outpatientPrescriptionMessageValidator.validate(outpatientPrescription);
    }

    @Override
    protected void doDelete(OutpatientPrescription outpatientPrescription) {
        outpatientPrescriptionService.delete(outpatientPrescription);

    }

}
