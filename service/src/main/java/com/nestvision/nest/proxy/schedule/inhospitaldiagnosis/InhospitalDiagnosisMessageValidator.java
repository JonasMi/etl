package com.nestvision.nest.proxy.schedule.inhospitaldiagnosis;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InhospitalDiagnosis;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InhospitalDiagnosisMessageValidator extends MessageValidatorSupport implements MessageValidator<InhospitalDiagnosis>{
    @Override
    public MessageValidateResult validate(InhospitalDiagnosis inhospitalDiagnosis) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inhospitalDiagnosis);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InhospitalDiagnosis[{}]消息校验结果:[{}]",  inhospitalDiagnosis.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InhospitalDiagnosis消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
