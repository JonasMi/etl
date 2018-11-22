package com.nestvision.nest.proxy.schedule.chargingitem;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.ChargingItem;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ChargingItemMessageValidator extends MessageValidatorSupport implements MessageValidator<ChargingItem>{
    @Override
    public MessageValidateResult validate(ChargingItem chargingItem) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(chargingItem);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("ChargingItem[{}]消息校验结果:[{}]",  chargingItem.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验ChargingItem消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
