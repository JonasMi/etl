package com.nestvision.nest.proxy.schedule.schedule;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Schedule;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheduleMessageValidator extends MessageValidatorSupport implements MessageValidator<Schedule>{
    @Override
    public MessageValidateResult validate(Schedule schedule) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(schedule);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Schedule[{}]消息校验结果:[{}]",  schedule.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Schedule消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
