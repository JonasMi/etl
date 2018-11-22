package com.nestvision.nest.proxy.schedule.examinereport;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.ExamineReport;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ExamineReportMessageValidator extends MessageValidatorSupport implements MessageValidator<ExamineReport>{
    @Override
    public MessageValidateResult validate(ExamineReport examineReport) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(examineReport);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("ExamineReport[{}]消息校验结果:[{}]",  examineReport.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验ExamineReport消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
