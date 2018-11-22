package com.nestvision.nest.proxy.schedule.outpatientsymptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;
import com.nestvision.nest.proxy.fhir.service.OutpatientSymptomService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientSymptomMessageScheduler extends AbstractMessageScheduler<OutpatientSymptom> {

    @Autowired
    private OutpatientSymptomService outpatientSymptomService;

    @Autowired
    private OutpatientSymptomMessageSender outpatientSymptomMessageSender;
    
	@Autowired
    private OutpatientSymptomMessageValidator outpatientSymptomMessageValidator;
    
    @Override
    protected Page<OutpatientSymptom> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OutpatientSymptom> query = new FhirResourceQuery<>();
        return outpatientSymptomService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OutpatientSymptom outpatientSymptom) {

        log.debug("发送消息[{}-{}],CN={}", outpatientSymptom.getClass().getSimpleName(),outpatientSymptom.getUid(), outpatientSymptom.getUpHospital());
        outpatientSymptomMessageSender.send(outpatientSymptom);

    }
    @Override
    protected MessageValidateResult doValidate(OutpatientSymptom outpatientSymptom) {

        return outpatientSymptomMessageValidator.validate(outpatientSymptom);
    }

    @Override
    protected void doDelete(OutpatientSymptom outpatientSymptom) {
        outpatientSymptomService.delete(outpatientSymptom);

    }

}
