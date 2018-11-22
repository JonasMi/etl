package com.nestvision.nest.proxy.schedule.hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Hospital;
import com.nestvision.nest.proxy.fhir.service.HospitalService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HospitalMessageScheduler extends AbstractMessageScheduler<Hospital> {

    @Autowired
    private HospitalService hospitalService;

    @Autowired
    private HospitalMessageSender hospitalMessageSender;
    
	@Autowired
    private HospitalMessageValidator hospitalMessageValidator;
    
    @Override
    protected Page<Hospital> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Hospital> query = new FhirResourceQuery<>();
        return hospitalService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Hospital hospital) {

        log.debug("发送消息[{}-{}],CN={}", hospital.getClass().getSimpleName(),hospital.getUid(), hospital.getUpHospital());
        hospitalMessageSender.send(hospital);

    }
    @Override
    protected MessageValidateResult doValidate(Hospital hospital) {

        return hospitalMessageValidator.validate(hospital);
    }

    @Override
    protected void doDelete(Hospital hospital) {
        hospitalService.delete(hospital);

    }

}
