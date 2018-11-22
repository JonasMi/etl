package com.nestvision.nest.proxy.schedule.medicalrecord;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.MedicalRecord;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MedicalRecordMessageValidator extends MessageValidatorSupport implements MessageValidator<MedicalRecord>{
    @Override
    public MessageValidateResult validate(MedicalRecord medicalRecord) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(medicalRecord);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("MedicalRecord[{}]消息校验结果:[{}]",  medicalRecord.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验MedicalRecord消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
