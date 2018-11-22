package com.nestvision.nest.proxy.config;

import com.nestvision.nest.proxy.base.exception.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;

/**
 * Created by 小小 on 2018/3/29 14:12
 */
@ControllerAdvice
@Slf4j
public class DefaultExceptionHandler {

    private static final String LABEL_STATUS = "status";

    private static final String LABEL_MESSAGE = "message";

    @ExceptionHandler(ResourceConflictException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public Object handle(ResourceConflictException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.CONFLICT.value(), exception.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Object handle(ResourceNotFoundException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }

    @ExceptionHandler(EtlException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object handle(EtlException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage());
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object handle(BadRequestException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }

    @ExceptionHandler(ResourceGoneException.class)
    @ResponseStatus(HttpStatus.GONE)
    @ResponseBody
    public Object handle(ResourceGoneException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.GONE.value(), exception.getMessage());
    }

    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    public Object handle(ForbiddenException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.FORBIDDEN.value(), exception.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Object handle(HttpRequestMethodNotSupportedException exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.METHOD_NOT_ALLOWED.value(), exception.getMessage());
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Object handle(MethodArgumentNotValidException exception) {
        log.warn(exception.getMessage(), exception);
        buildResultMap(HttpStatus.BAD_REQUEST.value(), getErrorModel(exception.getBindingResult()));
        return buildResultMap(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object handle(Exception exception) {
        log.warn(exception.getMessage(), exception);
        return buildResultMap(HttpStatus.INTERNAL_SERVER_ERROR.value(), exception.getMessage());
    }

    private Map<String, Object> buildResultMap(int status, Object errorMessage) {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put(LABEL_STATUS, status);
        result.put(LABEL_MESSAGE, errorMessage);
        return result;
    }

    private Map<String, List<String>> getErrorModel(BindingResult bindingResult) {
        Map<String, List<String>> map = new HashMap<>();
        bindingResult.getAllErrors().parallelStream().forEach(err -> {
            String key = err.getObjectName();
            if (err instanceof FieldError) {
                FieldError fieldError = (FieldError) err;
                key = fieldError.getObjectName() + "." + fieldError.getField();
            }

            List<String> errorMessages = map.computeIfAbsent(key, (t) -> new ArrayList<>());
            errorMessages.add(err.getDefaultMessage());
        });

        return map;
    }

}
