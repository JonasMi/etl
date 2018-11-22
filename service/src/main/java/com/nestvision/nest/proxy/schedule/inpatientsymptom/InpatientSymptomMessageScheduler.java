package com.nestvision.nest.proxy.schedule.inpatientsymptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.InpatientSymptomService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientSymptomMessageScheduler extends AbstractMessageScheduler<InpatientSymptom> {

    @Autowired
    private InpatientSymptomService inpatientSymptomService;

    @Autowired
    private InpatientSymptomMessageSender inpatientSymptomMessageSender;
    
	@Autowired
    private InpatientSymptomMessageValidator inpatientSymptomMessageValidator;
    
    @Override
    protected Page<InpatientSymptom> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<InpatientSymptom> query = new FhirResourceQuery<>();
        return inpatientSymptomService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(InpatientSymptom inpatientSymptom) {

        log.debug("发送消息[{}-{}],CN={}", inpatientSymptom.getClass().getSimpleName(),inpatientSymptom.getUid(), inpatientSymptom.getUpHospital());
        inpatientSymptomMessageSender.send(inpatientSymptom);

    }
    @Override
    protected MessageValidateResult doValidate(InpatientSymptom inpatientSymptom) {

        return inpatientSymptomMessageValidator.validate(inpatientSymptom);
    }

    @Override
    protected void doDelete(InpatientSymptom inpatientSymptom) {
        inpatientSymptomService.delete(inpatientSymptom);

    }

}
