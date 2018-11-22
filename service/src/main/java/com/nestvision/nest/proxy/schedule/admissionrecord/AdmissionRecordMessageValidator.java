package com.nestvision.nest.proxy.schedule.admissionrecord;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.AdmissionRecord;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AdmissionRecordMessageValidator extends MessageValidatorSupport implements MessageValidator<AdmissionRecord>{
    @Override
    public MessageValidateResult validate(AdmissionRecord admissionRecord) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(admissionRecord);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("AdmissionRecord[{}]消息校验结果:[{}]",  admissionRecord.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验AdmissionRecord消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
