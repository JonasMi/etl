package com.nestvision.nest.proxy.base.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public abstract class RestControllerSupport {

   

    protected Map<String, Object> fetchErrors(BindingResult bindingResult) {

        List<ObjectError> errors = bindingResult.getAllErrors();
        Map<String, Object> map = new HashMap<>(errors.size());
        for (ObjectError error : errors) {

            if (error instanceof FieldError) {
                FieldError fieldError = (FieldError) error;
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            } else {

                map.put(error.getObjectName(), error.getDefaultMessage());
            }
        }
        return map;
    }
    
    

}
