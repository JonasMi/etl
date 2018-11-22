package com.nestvision.nest.proxy.schedule.diagnosisprove;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.DiagnosisProve;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DiagnosisProveMessageValidator extends MessageValidatorSupport implements MessageValidator<DiagnosisProve>{
    @Override
    public MessageValidateResult validate(DiagnosisProve diagnosisProve) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(diagnosisProve);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("DiagnosisProve[{}]消息校验结果:[{}]",  diagnosisProve.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验DiagnosisProve消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
