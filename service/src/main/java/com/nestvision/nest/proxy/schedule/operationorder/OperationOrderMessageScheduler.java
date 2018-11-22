package com.nestvision.nest.proxy.schedule.operationorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;
import com.nestvision.nest.proxy.fhir.service.OperationOrderService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OperationOrderMessageScheduler extends AbstractMessageScheduler<OperationOrder> {

    @Autowired
    private OperationOrderService operationOrderService;

    @Autowired
    private OperationOrderMessageSender operationOrderMessageSender;
    
	@Autowired
    private OperationOrderMessageValidator operationOrderMessageValidator;
    
    @Override
    protected Page<OperationOrder> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<OperationOrder> query = new FhirResourceQuery<>();
        return operationOrderService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(OperationOrder operationOrder) {

        log.debug("发送消息[{}-{}],CN={}", operationOrder.getClass().getSimpleName(),operationOrder.getUid(), operationOrder.getUpHospital());
        operationOrderMessageSender.send(operationOrder);

    }
    @Override
    protected MessageValidateResult doValidate(OperationOrder operationOrder) {

        return operationOrderMessageValidator.validate(operationOrder);
    }

    @Override
    protected void doDelete(OperationOrder operationOrder) {
        operationOrderService.delete(operationOrder);

    }

}
