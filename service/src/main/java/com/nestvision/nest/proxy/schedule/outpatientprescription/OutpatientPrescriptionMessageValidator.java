package com.nestvision.nest.proxy.schedule.outpatientprescription;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientPrescription;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientPrescriptionMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientPrescription>{
    @Override
    public MessageValidateResult validate(OutpatientPrescription outpatientPrescription) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientPrescription);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientPrescription[{}]消息校验结果:[{}]",  outpatientPrescription.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientPrescription消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
