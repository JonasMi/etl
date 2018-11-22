package com.nestvision.nest.proxy.schedule.deathproof;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.DeathProof;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DeathProofMessageValidator extends MessageValidatorSupport implements MessageValidator<DeathProof>{
    @Override
    public MessageValidateResult validate(DeathProof deathProof) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(deathProof);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("DeathProof[{}]消息校验结果:[{}]",  deathProof.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验DeathProof消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
