package com.nestvision.nest.proxy.schedule.dischargesummary;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.DischargeSummary;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DischargeSummaryMessageValidator extends MessageValidatorSupport implements MessageValidator<DischargeSummary>{
    @Override
    public MessageValidateResult validate(DischargeSummary dischargeSummary) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(dischargeSummary);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("DischargeSummary[{}]消息校验结果:[{}]",  dischargeSummary.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验DischargeSummary消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
