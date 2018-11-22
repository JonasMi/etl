package com.nestvision.nest.proxy.schedule.operation;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Operation;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OperationMessageValidator extends MessageValidatorSupport implements MessageValidator<Operation>{
    @Override
    public MessageValidateResult validate(Operation operation) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(operation);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Operation[{}]消息校验结果:[{}]",  operation.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Operation消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
