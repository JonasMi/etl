package com.nestvision.nest.proxy.history.match;

public class RegexPattern extends PropertyPattern {

    /**
     * 
     */
    private static final long serialVersionUID = -3648649170847211422L;

    public RegexPattern(String property, String pattern) {

        super(property, pattern);
    }

    @Override
    protected boolean matchPropertyValue(Object propertyValue, String pattern) {
        boolean match = false;

        if (propertyValue != null) {

            if (propertyValue instanceof String) {
                String valueString = (String) propertyValue;
                match = java.util.regex.Pattern.matches(pattern, valueString);
            } else {
                throw new IllegalArgumentException("数据类型不是字符串类型,无法进行匹配");
            }
        }

        return match;
    }

}
