package com.nestvision.nest.proxy.schedule.temporaryadvice;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.TemporaryAdvice;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TemporaryAdviceMessageValidator extends MessageValidatorSupport implements MessageValidator<TemporaryAdvice>{
    @Override
    public MessageValidateResult validate(TemporaryAdvice temporaryAdvice) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(temporaryAdvice);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("TemporaryAdvice[{}]消息校验结果:[{}]",  temporaryAdvice.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验TemporaryAdvice消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
