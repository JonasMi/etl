package com.nestvision.nest.proxy.schedule.appointment;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Appointment;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AppointmentMessageValidator extends MessageValidatorSupport implements MessageValidator<Appointment>{
    @Override
    public MessageValidateResult validate(Appointment appointment) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(appointment);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Appointment[{}]消息校验结果:[{}]",  appointment.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Appointment消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
