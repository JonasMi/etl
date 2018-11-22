package com.nestvision.nest.proxy.schedule.medication;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Medication;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MedicationMessageValidator extends MessageValidatorSupport implements MessageValidator<Medication>{
    @Override
    public MessageValidateResult validate(Medication medication) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(medication);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Medication[{}]消息校验结果:[{}]",  medication.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Medication消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
