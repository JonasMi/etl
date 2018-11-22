package com.nestvision.nest.proxy.schedule.ininjuryexternalcause;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InInjuryExternalCause;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InInjuryExternalCauseMessageValidator extends MessageValidatorSupport implements MessageValidator<InInjuryExternalCause>{
    @Override
    public MessageValidateResult validate(InInjuryExternalCause inInjuryExternalCause) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inInjuryExternalCause);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InInjuryExternalCause[{}]消息校验结果:[{}]",  inInjuryExternalCause.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InInjuryExternalCause消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
