package com.nestvision.nest.proxy.history.match;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class PropertyPattern implements Pattern {

    /**
     * 
     */
    private static final long serialVersionUID = -8457182773053949698L;
    private String property;
    private String pattern;
    public PropertyPattern(String property,String pattern){
        this.property=property;
        this.pattern =pattern;
    }
    @Override
    public boolean match(Object objet) {
        Class<?> beanClass = objet.getClass();
        PropertyDescriptor propertyDescriptor;
        try {
            propertyDescriptor = new PropertyDescriptor(property, beanClass);
        } catch (IntrospectionException e) {
            log.info("未找到类" + beanClass + "匹配的字段:" + property, e);
            return false;
        }
        Method method = propertyDescriptor.getReadMethod();
        Object propertyValue;
        if (method != null) {
            try {
                propertyValue = method.invoke(objet);
            } catch (Exception e) {
                log.info("调用" + beanClass + "匹配的方法:" + method.getName() + "失败", e);
                return false;
            }

            return matchPropertyValue(propertyValue,pattern);

        }

        return false;
    }
    @Override
    public PatternConfiguration toPatternConfiguration() {
        PatternConfiguration patternConfiguration= new PatternConfiguration();
        patternConfiguration.setPattern(pattern);
        patternConfiguration.setPatternClass(this.getClass().getName());
        patternConfiguration.setProperty(property);
        return patternConfiguration;
    }
    protected abstract boolean matchPropertyValue(Object propertyValue,String pattern);

}
