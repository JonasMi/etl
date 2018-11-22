package com.nestvision.nest.proxy.schedule.inspectorder;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InspectOrder;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InspectOrderMessageValidator extends MessageValidatorSupport implements MessageValidator<InspectOrder>{
    @Override
    public MessageValidateResult validate(InspectOrder inspectOrder) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inspectOrder);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InspectOrder[{}]消息校验结果:[{}]",  inspectOrder.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InspectOrder消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
