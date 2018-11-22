package com.nestvision.nest.proxy.schedule.operationorder;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.OperationOrder;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OperationOrderMessageValidator extends MessageValidatorSupport implements MessageValidator<OperationOrder>{
    @Override
    public MessageValidateResult validate(OperationOrder operationOrder) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(operationOrder);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("OperationOrder[{}]消息校验结果:[{}]",  operationOrder.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验OperationOrder消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
