package com.nestvision.nest.proxy.schedule.outpatientregistration;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientRegistration;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientRegistrationMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientRegistration>{
    @Override
    public MessageValidateResult validate(OutpatientRegistration outpatientRegistration) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientRegistration);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientRegistration[{}]消息校验结果:[{}]",  outpatientRegistration.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientRegistration消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
