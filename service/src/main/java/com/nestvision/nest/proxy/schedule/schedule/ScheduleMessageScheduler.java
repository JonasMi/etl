package com.nestvision.nest.proxy.schedule.schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.fhir.query.FhirResourceQuery;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity.DealState;
import com.nestvision.nest.proxy.fhir.entity.Schedule;
import com.nestvision.nest.proxy.fhir.service.ScheduleService;
import com.nestvision.nest.proxy.schedule.AbstractMessageScheduler;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheduleMessageScheduler extends AbstractMessageScheduler<Schedule> {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private ScheduleMessageSender scheduleMessageSender;
    
	@Autowired
    private ScheduleMessageValidator scheduleMessageValidator;
    
    @Override
    protected Page<Schedule> scanOnce(int page, int size) {
        PageRequest pageable = new PageRequest(page, size, Direction.ASC, "upTime");
        FhirResourceQuery<Schedule> query = new FhirResourceQuery<>();
        return scheduleService.findAll(query, pageable);
    }
	
    @Override
    protected void doSend(Schedule schedule) {

        log.debug("发送消息[{}-{}],CN={}", schedule.getClass().getSimpleName(),schedule.getUid(), schedule.getUpHospital());
        scheduleMessageSender.send(schedule);

    }
    @Override
    protected MessageValidateResult doValidate(Schedule schedule) {

        return scheduleMessageValidator.validate(schedule);
    }

    @Override
    protected void doDelete(Schedule schedule) {
        scheduleService.delete(schedule);

    }

}
