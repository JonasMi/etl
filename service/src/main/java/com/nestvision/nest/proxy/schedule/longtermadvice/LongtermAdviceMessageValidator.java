package com.nestvision.nest.proxy.schedule.longtermadvice;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.LongtermAdvice;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LongtermAdviceMessageValidator extends MessageValidatorSupport implements MessageValidator<LongtermAdvice>{
    @Override
    public MessageValidateResult validate(LongtermAdvice longtermAdvice) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(longtermAdvice);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("LongtermAdvice[{}]消息校验结果:[{}]",  longtermAdvice.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验LongtermAdvice消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
