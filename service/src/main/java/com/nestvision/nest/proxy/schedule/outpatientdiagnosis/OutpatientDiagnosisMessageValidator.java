package com.nestvision.nest.proxy.schedule.outpatientdiagnosis;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientDiagnosis;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientDiagnosisMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientDiagnosis>{
    @Override
    public MessageValidateResult validate(OutpatientDiagnosis outpatientDiagnosis) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientDiagnosis);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientDiagnosis[{}]消息校验结果:[{}]",  outpatientDiagnosis.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientDiagnosis消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
