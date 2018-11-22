package com.nestvision.nest.proxy.schedule.examineorder;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.ExamineOrder;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExamineOrderMessageValidator extends MessageValidatorSupport implements MessageValidator<ExamineOrder>{
    @Override
    public MessageValidateResult validate(ExamineOrder examineOrder) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(examineOrder);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("ExamineOrder[{}]消息校验结果:[{}]",  examineOrder.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验ExamineOrder消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
