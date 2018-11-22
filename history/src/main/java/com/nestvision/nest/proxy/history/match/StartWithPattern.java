package com.nestvision.nest.proxy.history.match;

import org.apache.commons.lang3.StringUtils;

public class StartWithPattern extends PropertyPattern {

    /**
     * 
     */
    private static final long serialVersionUID = -1895943490608137382L;

    public StartWithPattern(String property, String pattern) {
        super(property, pattern);
    }

    @Override
    protected boolean matchPropertyValue(Object propertyValue, String pattern) {

        boolean match = false;

        if (propertyValue != null) {

            if (propertyValue instanceof String) {
                String value = (String) propertyValue;
                match = StringUtils.startsWith(value, pattern);
            } else {
                throw new IllegalArgumentException("数据类型不是字符串类型,无法进行匹配");
            }
        }

        return match;
    }

}
