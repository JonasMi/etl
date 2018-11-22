package com.nestvision.nest.proxy.schedule.clinictype;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Clinictype;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ClinictypeMessageValidator extends MessageValidatorSupport implements MessageValidator<Clinictype>{
    @Override
    public MessageValidateResult validate(Clinictype clinictype) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(clinictype);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Clinictype[{}]消息校验结果:[{}]",  clinictype.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Clinictype消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
