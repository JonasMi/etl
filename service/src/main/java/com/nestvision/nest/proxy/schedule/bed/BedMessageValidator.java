package com.nestvision.nest.proxy.schedule.bed;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Bed;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BedMessageValidator extends MessageValidatorSupport implements MessageValidator<Bed>{
    @Override
    public MessageValidateResult validate(Bed bed) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(bed);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Bed[{}]消息校验结果:[{}]",  bed.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Bed消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
