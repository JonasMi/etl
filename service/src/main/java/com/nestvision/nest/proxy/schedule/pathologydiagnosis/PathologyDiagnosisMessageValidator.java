package com.nestvision.nest.proxy.schedule.pathologydiagnosis;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.PathologyDiagnosis;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PathologyDiagnosisMessageValidator extends MessageValidatorSupport implements MessageValidator<PathologyDiagnosis>{
    @Override
    public MessageValidateResult validate(PathologyDiagnosis pathologyDiagnosis) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(pathologyDiagnosis);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("PathologyDiagnosis[{}]消息校验结果:[{}]",  pathologyDiagnosis.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验PathologyDiagnosis消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
