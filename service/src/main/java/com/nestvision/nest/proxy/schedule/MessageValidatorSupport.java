package com.nestvision.nest.proxy.schedule;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nestvision.nest.proxy.fhir.anotaion.FhirFieldValidate;
import com.nestvision.nest.proxy.nest.entity.DataQuaityReportInvalidColumn.InvalidType;
import com.nestvision.nest.proxy.nest.service.ValueRangeService;

@Component
public class MessageValidatorSupport {

    @Autowired
    private ValueRangeService valueRangeService;

    protected MessageValidateResult doValidate(Object object) throws Exception {

        MessageValidateResult messageValidateResult = new MessageValidateResult(object);

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(object);

        Class<? extends Object> clazz = object.getClass();

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String fieldName = propertyDescriptor.getName();
            Field field = FieldUtils.getField(clazz, fieldName, true);
            Method readMethod = propertyDescriptor.getReadMethod();
            if (field != null && readMethod != null) {

                Object value = readMethod.invoke(object);
                // 校验子表
                if (value instanceof Collection) {
                    @SuppressWarnings("rawtypes")
                    Collection collection = (Collection) value;
                    for (Object element : collection) {
                        MessageValidateResult result = doValidate(element);
                        if(!result.getInvalidColumns().isEmpty()){
                        	messageValidateResult.addInternalResult(result);
                        }
                    }
                } else {
                    // 校验当前表数据
                    FhirFieldValidate fhirFieldValidate = field.getAnnotation(FhirFieldValidate.class);
                    if (fhirFieldValidate != null) {
                        internalValidate(messageValidateResult, fhirFieldValidate, propertyDescriptor.getPropertyType(), value);

                    }
                }

            }
        }

        return messageValidateResult;
    }

    private String toStringValue(Object value) {

        if (value instanceof String) {
            return (String) value;
        }
        if (value instanceof Date) {
            return DateFormatUtils.format((Date) value, "yyyy-MM-dd HH:mm:ss");
        }
        if (value instanceof Boolean) {
            return (Boolean) value ? "1" : "0";
        }
        if (value == null) {
            return "";
        }
        return value.toString();

    }

    private void internalValidate(MessageValidateResult messageValidateResult, FhirFieldValidate fhirFieldValidate, Class<?> valueType, Object value) {

        String name = fhirFieldValidate.name();
        String displayName = fhirFieldValidate.displayName();
        if (StringUtils.isBlank(displayName)) {
            displayName = name;
        }

        // 校验必填
        if (fhirFieldValidate.required()) {
            if (value == null) {
                InvalidColumn invalidColumn = new InvalidColumn(name, displayName, InvalidType.REQUIRED_COLUMN_MISS, "必填字段缺失", toStringValue(value));
                messageValidateResult.addInvalidColumn(invalidColumn);
            }
        }
        // 校验字符串
        String strValue = toStringValue(value);
        int minLength = fhirFieldValidate.minLength();
        int maxLength = fhirFieldValidate.maxLength();
        int length = StringUtils.length(strValue);

        // 校验长度
        if (minLength > length) {
            InvalidColumn invalidColumn = new InvalidColumn(name, displayName, InvalidType.LENGTH_INVALID, "字段长度不能少于" + minLength + "个字符长度", strValue);
            messageValidateResult.addInvalidColumn(invalidColumn);
        }
        if (maxLength < length) {
            InvalidColumn invalidColumn = new InvalidColumn(name, displayName, InvalidType.LENGTH_INVALID, "字段长度不能超过" + maxLength + "个字符长度", strValue);
            messageValidateResult.addInvalidColumn(invalidColumn);
        }
        // 校验值域
        String valuesRange = fhirFieldValidate.valuesRange();
        if (!StringUtils.isBlank(valuesRange)) {
            if (strValue != null && !"".equals(strValue)) {
                if (!isValuesRangeContainsValue(valuesRange, strValue)) {

                    InvalidColumn invalidColumn = new InvalidColumn(name, displayName, InvalidType.VALUE_RANGE_INVALID, "数据范围不符[" + valuesRange + "]中的定义",
                                                                    strValue);
                    messageValidateResult.addInvalidColumn(invalidColumn);
                }
            }
        }

    }

    protected boolean isValuesRangeContainsValue(String valuesRange, String value) {

        return valueRangeService.contains(valuesRange, value);
    }

}
