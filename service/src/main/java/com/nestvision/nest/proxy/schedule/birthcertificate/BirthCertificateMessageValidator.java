package com.nestvision.nest.proxy.schedule.birthcertificate;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.BirthCertificate;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BirthCertificateMessageValidator extends MessageValidatorSupport implements MessageValidator<BirthCertificate>{
    @Override
    public MessageValidateResult validate(BirthCertificate birthCertificate) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(birthCertificate);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("BirthCertificate[{}]消息校验结果:[{}]",  birthCertificate.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验BirthCertificate消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
