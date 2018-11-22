package com.nestvision.nest.proxy.schedule.inspectreport;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.InspectReport;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class InspectReportMessageValidator extends MessageValidatorSupport implements MessageValidator<InspectReport>{
    @Override
    public MessageValidateResult validate(InspectReport inspectReport) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(inspectReport);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("InspectReport[{}]消息校验结果:[{}]",  inspectReport.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验InspectReport消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
