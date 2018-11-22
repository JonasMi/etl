package com.nestvision.nest.proxy.schedule.adulthealthexamination;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.AdultHealthExamination;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AdultHealthExaminationMessageValidator extends MessageValidatorSupport implements MessageValidator<AdultHealthExamination>{
    @Override
    public MessageValidateResult validate(AdultHealthExamination adultHealthExamination) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(adultHealthExamination);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("AdultHealthExamination[{}]消息校验结果:[{}]",  adultHealthExamination.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验AdultHealthExamination消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
