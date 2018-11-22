package com.nestvision.nest.proxy.schedule.deathproof;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;
import com.nestvision.nest.proxy.fhir.service.DeathProofService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DeathProofMessageScheduler extends AbstractMessageScheduler<DeathProof> {

    @Autowired
    private DeathProofService deathProofService;

    @Autowired
    private DeathProofMessageSender deathProofMessageSender;
    
	@Autowired
    private DeathProofMessageValidator deathProofMessageValidator;
    
    @Override
    protected Page<DeathProof> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<DeathProof> query = new FhirResourceQuery<>();
        return deathProofService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(DeathProof deathProof) {

        log.debug("发送消息[{}-{}],CN={}", deathProof.getClass().getSimpleName(),deathProof.getUid(), deathProof.getUpHospital());
        deathProofMessageSender.send(deathProof);

    }
    @Override
    protected MessageValidateResult doValidate(DeathProof deathProof) {

        return deathProofMessageValidator.validate(deathProof);
    }

    @Override
    protected void doDelete(DeathProof deathProof) {
        deathProofService.delete(deathProof);

    }

}
