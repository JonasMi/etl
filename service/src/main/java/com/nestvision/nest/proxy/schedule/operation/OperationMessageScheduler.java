package com.nestvision.nest.proxy.schedule.operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Operation;
import com.nestvision.nest.proxy.fhir.service.OperationService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OperationMessageScheduler extends AbstractMessageScheduler<Operation> {

    @Autowired
    private OperationService operationService;

    @Autowired
    private OperationMessageSender operationMessageSender;
    
	@Autowired
    private OperationMessageValidator operationMessageValidator;
    
    @Override
    protected Page<Operation> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Operation> query = new FhirResourceQuery<>();
        return operationService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Operation operation) {

        log.debug("发送消息[{}-{}],CN={}", operation.getClass().getSimpleName(),operation.getUid(), operation.getUpHospital());
        operationMessageSender.send(operation);

    }
    @Override
    protected MessageValidateResult doValidate(Operation operation) {

        return operationMessageValidator.validate(operation);
    }

    @Override
    protected void doDelete(Operation operation) {
        operationService.delete(operation);

    }

}
