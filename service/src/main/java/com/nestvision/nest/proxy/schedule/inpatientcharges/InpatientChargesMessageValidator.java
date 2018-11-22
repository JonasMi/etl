package com.nestvision.nest.proxy.schedule.inpatientcharges;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InpatientCharges;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientChargesMessageValidator extends MessageValidatorSupport implements MessageValidator<InpatientCharges>{
    @Override
    public MessageValidateResult validate(InpatientCharges inpatientCharges) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inpatientCharges);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InpatientCharges[{}]消息校验结果:[{}]",  inpatientCharges.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InpatientCharges消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
