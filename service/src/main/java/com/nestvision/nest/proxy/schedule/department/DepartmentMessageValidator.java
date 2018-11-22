package com.nestvision.nest.proxy.schedule.department;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Department;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DepartmentMessageValidator extends MessageValidatorSupport implements MessageValidator<Department>{
    @Override
    public MessageValidateResult validate(Department department) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(department);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Department[{}]消息校验结果:[{}]",  department.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Department消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}