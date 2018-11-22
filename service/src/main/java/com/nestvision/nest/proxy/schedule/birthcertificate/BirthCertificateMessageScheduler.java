package com.nestvision.nest.proxy.schedule.birthcertificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;
import com.nestvision.nest.proxy.fhir.service.BirthCertificateService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BirthCertificateMessageScheduler extends AbstractMessageScheduler<BirthCertificate> {

    @Autowired
    private BirthCertificateService birthCertificateService;

    @Autowired
    private BirthCertificateMessageSender birthCertificateMessageSender;
    
	@Autowired
    private BirthCertificateMessageValidator birthCertificateMessageValidator;
    
    @Override
    protected Page<BirthCertificate> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<BirthCertificate> query = new FhirResourceQuery<>();
        return birthCertificateService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(BirthCertificate birthCertificate) {

        log.debug("发送消息[{}-{}],CN={}", birthCertificate.getClass().getSimpleName(),birthCertificate.getUid(), birthCertificate.getUpHospital());
        birthCertificateMessageSender.send(birthCertificate);

    }
    @Override
    protected MessageValidateResult doValidate(BirthCertificate birthCertificate) {

        return birthCertificateMessageValidator.validate(birthCertificate);
    }

    @Override
    protected void doDelete(BirthCertificate birthCertificate) {
        birthCertificateService.delete(birthCertificate);

    }

}
