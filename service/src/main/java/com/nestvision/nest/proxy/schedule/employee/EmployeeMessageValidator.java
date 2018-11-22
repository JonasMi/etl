package com.nestvision.nest.proxy.schedule.employee;

import org.springframework.stereotype.Component;
import com.nestvision.nest.proxy.base.util.JSONUtil;
import com.nestvision.nest.proxy.fhir.entity.Employee;
import com.nestvision.nest.proxy.schedule.MessageValidateResult;
import com.nestvision.nest.proxy.schedule.MessageValidator;
import com.nestvision.nest.proxy.schedule.MessageValidatorSupport;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EmployeeMessageValidator extends MessageValidatorSupport implements MessageValidator<Employee>{
    @Override
    public MessageValidateResult validate(Employee employee) {
        MessageValidateResult messageValidateResult;
        try {
            messageValidateResult = doValidate(employee);
            if(log.isDebugEnabled()){
                String result =JSONUtil.toJSONString(messageValidateResult);             
                log.debug("Employee[{}]消息校验结果:[{}]",  employee.getUid(),result);
            }           
            return messageValidateResult;
        } catch (Exception e) {
			 log.error("在校验Employee消息的时候发生错误:"+e.getMessage(),e);
            throw new RuntimeException(e);
        }
    }

}
