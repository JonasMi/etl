package com.nestvision.nest.proxy.schedule.outpatientsymptom;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientSymptom;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientSymptomMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientSymptom>{
    @Override
    public MessageValidateResult validate(OutpatientSymptom outpatientSymptom) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientSymptom);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientSymptom[{}]消息校验结果:[{}]",  outpatientSymptom.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientSymptom消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
