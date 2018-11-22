package com.nestvision.nest.proxy.schedule.outhospitalotherdiagnosis;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OuthospitalOtherDiagnosis;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OuthospitalOtherDiagnosisMessageValidator extends MessageValidatorSupport implements MessageValidator<OuthospitalOtherDiagnosis>{
    @Override
    public MessageValidateResult validate(OuthospitalOtherDiagnosis outhospitalOtherDiagnosis) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outhospitalOtherDiagnosis);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OuthospitalOtherDiagnosis[{}]消息校验结果:[{}]",  outhospitalOtherDiagnosis.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OuthospitalOtherDiagnosis消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
