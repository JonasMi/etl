package com.nestvision.nest.proxy.history.match;

import org.apache.commons.lang3.StringUtils;

public class ContainsPattern extends PropertyPattern {

    /**
     * 
     */
    private static final long serialVersionUID = -8710993959409137347L;

    public ContainsPattern(String property, String pattern) {
        super(property, pattern);

    }

    @Override
    protected boolean matchPropertyValue(Object propertyValue, String pattern) {

        boolean match = false;

        if (propertyValue != null) {

            if (propertyValue instanceof String) {
                String valueString = (String) propertyValue;
                match = StringUtils.contains(valueString, pattern);
            } else {
                throw new IllegalArgumentException("数据类型不是字符串类型,无法进行匹配");
            }
        }

        return match;
    }

}