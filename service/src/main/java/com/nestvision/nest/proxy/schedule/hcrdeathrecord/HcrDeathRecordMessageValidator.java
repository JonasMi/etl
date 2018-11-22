package com.nestvision.nest.proxy.schedule.hcrdeathrecord;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.HcrDeathRecord;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HcrDeathRecordMessageValidator extends MessageValidatorSupport implements MessageValidator<HcrDeathRecord>{
    @Override
    public MessageValidateResult validate(HcrDeathRecord hcrDeathRecord) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(hcrDeathRecord);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("HcrDeathRecord[{}]消息校验结果:[{}]",  hcrDeathRecord.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验HcrDeathRecord消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
