package com.nestvision.nest.proxy.base.api.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestResponseFactory {

    public static final int STATUS_ERROR = 500;

    public static final int STATUS_INPUT_ERROR = 400;

    public static final int STATUS_AUTH_ERROR = 401;

    public static final int STATUS_NOT_FOUND_ERROR = 404;

    public static final int STATUS_SUCCESS = 200;

    private RestResponseFactory() {

    }

    public static <T> RestResponse<T> newSuccessResponse(String msg, T data) {

        return new RestResponse<T>(STATUS_SUCCESS, data, msg);

    }

    public static <T> RestResponse<T> newSuccessResponse(T data) {

        return new RestResponse<T>(STATUS_SUCCESS, data, null);

    }

    public static <T> RestResponse<T> newErrorResponse(String msg) {

        return new RestResponse<T>(STATUS_ERROR, null, msg);

    }

    public static <T> RestResponse<T> newNotFoundErrorResponse(String msg) {
        return new RestResponse<T>(STATUS_NOT_FOUND_ERROR, null, msg);
    }

    public static <T> RestResponse<T> newAuthErrorResponse(String msg) {
        return new RestResponse<T>(STATUS_AUTH_ERROR, null, msg);
    }

    public static <T> RestResponse<T> newInputErrorResponse(String field, String error) {
        Map<String, Object> map = new HashMap<String, Object>(1);
        map.put(field, error);
        return newInputErrorResponse(map);
    }

    public static <T> RestResponse<T> newInputErrorResponse(Map<String, Object> errors) {

        ObjectMapper mapper = new ObjectMapper();
        String msg;
        try {
            msg = mapper.writeValueAsString(errors);
            return new RestResponse<T>(STATUS_INPUT_ERROR, null, msg);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public static EmptyRestResponse newInputErrorEmptyResponse(Map<String, Object> errors) {

        ObjectMapper mapper = new ObjectMapper();
        String msg;
        try {
            msg = mapper.writeValueAsString(errors);
            return new EmptyRestResponse(STATUS_INPUT_ERROR, msg);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static EmptyRestResponse newErrorEmptyResponse(String msg) {
        return new EmptyRestResponse(STATUS_ERROR, msg);
    }

    public static EmptyRestResponse newNotFoundErrorEmptyResponse(String msg) {
        return new EmptyRestResponse(STATUS_NOT_FOUND_ERROR, msg);
    }

    public static EmptyRestResponse newSuccessEmptyResponse(String msg) {

        return new EmptyRestResponse(STATUS_SUCCESS, msg);

    }

    public static EmptyRestResponse newSuccessEmptyResponse() {

        return new EmptyRestResponse(STATUS_SUCCESS, null);

    }

}
