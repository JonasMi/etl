package com.nestvision.nest.proxy.schedule.outpatientcharges;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientCharges;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientChargesMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientCharges>{
    @Override
    public MessageValidateResult validate(OutpatientCharges outpatientCharges) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientCharges);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientCharges[{}]消息校验结果:[{}]",  outpatientCharges.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientCharges消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
