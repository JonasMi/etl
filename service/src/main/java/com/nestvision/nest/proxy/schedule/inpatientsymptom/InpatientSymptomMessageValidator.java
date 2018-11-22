package com.nestvision.nest.proxy.schedule.inpatientsymptom;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InpatientSymptom;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InpatientSymptomMessageValidator extends MessageValidatorSupport implements MessageValidator<InpatientSymptom>{
    @Override
    public MessageValidateResult validate(InpatientSymptom inpatientSymptom) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inpatientSymptom);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InpatientSymptom[{}]消息校验结果:[{}]",  inpatientSymptom.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InpatientSymptom消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
