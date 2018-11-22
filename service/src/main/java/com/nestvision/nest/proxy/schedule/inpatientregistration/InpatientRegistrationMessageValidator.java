package com.nestvision.nest.proxy.schedule.inpatientregistration;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InpatientRegistration;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientRegistrationMessageValidator extends MessageValidatorSupport implements MessageValidator<InpatientRegistration>{
    @Override
    public MessageValidateResult validate(InpatientRegistration inpatientRegistration) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inpatientRegistration);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InpatientRegistration[{}]消息校验结果:[{}]",  inpatientRegistration.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InpatientRegistration消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
