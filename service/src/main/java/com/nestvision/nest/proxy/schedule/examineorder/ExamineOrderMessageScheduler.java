package com.nestvision.nest.proxy.schedule.examineorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;
import com.nestvision.nest.proxy.fhir.service.ExamineOrderService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExamineOrderMessageScheduler extends AbstractMessageScheduler<ExamineOrder> {

    @Autowired
    private ExamineOrderService examineOrderService;

    @Autowired
    private ExamineOrderMessageSender examineOrderMessageSender;
    
	@Autowired
    private ExamineOrderMessageValidator examineOrderMessageValidator;
    
    @Override
    protected Page<ExamineOrder> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<ExamineOrder> query = new FhirResourceQuery<>();
        return examineOrderService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(ExamineOrder examineOrder) {

        log.debug("发送消息[{}-{}],CN={}", examineOrder.getClass().getSimpleName(),examineOrder.getUid(), examineOrder.getUpHospital());
        examineOrderMessageSender.send(examineOrder);

    }
    @Override
    protected MessageValidateResult doValidate(ExamineOrder examineOrder) {

        return examineOrderMessageValidator.validate(examineOrder);
    }

    @Override
    protected void doDelete(ExamineOrder examineOrder) {
        examineOrderService.delete(examineOrder);

    }

}
