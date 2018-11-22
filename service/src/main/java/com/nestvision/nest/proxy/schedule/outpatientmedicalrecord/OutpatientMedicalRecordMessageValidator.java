package com.nestvision.nest.proxy.schedule.outpatientmedicalrecord;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OutpatientMedicalRecord;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OutpatientMedicalRecordMessageValidator extends MessageValidatorSupport implements MessageValidator<OutpatientMedicalRecord>{
    @Override
    public MessageValidateResult validate(OutpatientMedicalRecord outpatientMedicalRecord) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(outpatientMedicalRecord);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OutpatientMedicalRecord[{}]消息校验结果:[{}]",  outpatientMedicalRecord.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OutpatientMedicalRecord消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
