package com.nestvision.nest.proxy.schedule.patient;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Patient;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PatientMessageValidator extends MessageValidatorSupport implements MessageValidator<Patient>{
    @Override
    public MessageValidateResult validate(Patient patient) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(patient);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Patient[{}]消息校验结果:[{}]",  patient.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Patient消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
