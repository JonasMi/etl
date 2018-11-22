package com.nestvision.nest.proxy.fhir.util;

import com.nestvision.nest.proxy.base.util.JSONUtil;
import org.apache.commons.lang3.exception.ExceptionUtils;

import com.nestvision.nest.proxy.base.entity.BaseEntity;
import com.nestvision.nest.proxy.fhir.entity.FhirResourceEntity;
import com.nestvision.nest.proxy.nest.client.NestResponse;
import com.nestvision.nest.proxy.transform.model.NestRequest;

public class NestRequestUtil {
    private static final String TABLE_SUFFIX = "_nest_request";

    public static final String RESPONSE_ERROR_TYPE = "RESPONSE_ERROR";

    private NestRequestUtil() {

    }

    public static void wrapException(NestRequest nestRequest, Exception exception) {

        if (exception == null) {
            nestRequest.setErrorMessage(null);
        } else {
            Throwable rootCause = ExceptionUtils.getRootCause(exception);
            if (rootCause == null) {
                rootCause = exception;
            }
            nestRequest.setErrorMessage(rootCause.getMessage());
            nestRequest.setSuccess(false);
        }
    }

    public static String detectNestRequestTableName(String fhirResourceEntityClasName) {

        Class<?> clazz;
        try {
            clazz = Class.forName(fhirResourceEntityClasName);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("无法找到FhirResourceEntity类:" + e.getMessage(), e);
        }
        if (FhirResourceEntity.class.isAssignableFrom(clazz)) {
            Class<? extends FhirResourceEntity> fhirClazz = (Class<? extends FhirResourceEntity>) clazz;
            return detectNestRequestTableName(fhirClazz);
        } else {
            throw new IllegalArgumentException("输入类名:" + fhirResourceEntityClasName + " 不是FhirResourceEntity类型的");
        }

    }

    public static String detectNestRequestTableName(Class<? extends FhirResourceEntity> clazz) {

        String className = clazz.getSimpleName();
        String prefix = BaseEntity.TABLE_PREFIX;
        return prefix + className + TABLE_SUFFIX;
    }

    public static void wrapResponse(NestRequest nestRequest, NestResponse nestResponse) {
        nestRequest.setSuccess(nestResponse.isSuccess());
        nestRequest.setErrorMessage(nestResponse.getFaultString());
        if (nestResponse.isSuccess()) {
            nestRequest.setProcessResult(FhirResourceEntity.ProcessResult.SUCCESS.name());
        } else {
            //TODO 根据不同的异常 设置不同的处理结果
            nestRequest.setProcessResult(FhirResourceEntity.ProcessResult.GENERIC_EXCEPTION.name());
        }
    }

}
