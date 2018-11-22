package com.nestvision.nest.proxy.schedule.neonataldefectsdiagnosis;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.NeonatalDefectsDiagnosis;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class NeonatalDefectsDiagnosisMessageValidator extends MessageValidatorSupport implements MessageValidator<NeonatalDefectsDiagnosis>{
    @Override
    public MessageValidateResult validate(NeonatalDefectsDiagnosis neonatalDefectsDiagnosis) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(neonatalDefectsDiagnosis);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("NeonatalDefectsDiagnosis[{}]消息校验结果:[{}]",  neonatalDefectsDiagnosis.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验NeonatalDefectsDiagnosis消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
