package com.nestvision.nest.proxy.schedule.pathologicalreport;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.PathologicalReport;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PathologicalReportMessageValidator extends MessageValidatorSupport implements MessageValidator<PathologicalReport>{
    @Override
    public MessageValidateResult validate(PathologicalReport pathologicalReport) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(pathologicalReport);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("PathologicalReport[{}]消息校验结果:[{}]",  pathologicalReport.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验PathologicalReport消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
