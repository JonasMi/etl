package com.nestvision.nest.proxy.schedule.slot;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Slot;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SlotMessageValidator extends MessageValidatorSupport implements MessageValidator<Slot>{
    @Override
    public MessageValidateResult validate(Slot slot) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(slot);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Slot[{}]消息校验结果:[{}]",  slot.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Slot消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
