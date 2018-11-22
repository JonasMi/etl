package com.nestvision.nest.proxy.history.match;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.nestvision.nest.proxy.history.exception.MatcherBuildException;

import lombok.Data;

@Data
public class PatternConfiguration implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3376514416356227627L;

    private String patternClass;

    private String pattern;
    
    private String property;

    public Pattern buildPattern(){
       
        Class<?> clazz;
        try {
            clazz = Class.forName(patternClass);
        } catch (ClassNotFoundException e) {
            throw new MatcherBuildException("无法在当前上下文当中找到Pattern类:" + patternClass, e);
        }
        Constructor<?> constructor;
        if (PropertyPattern.class.isAssignableFrom(clazz)) {
            try {
                constructor = clazz.getConstructor(String.class, String.class);
            } catch (NoSuchMethodException | SecurityException e) {
                throw new MatcherBuildException("没有发现可用的Pattern构造方法 PropertyPattern(String,String)", e);
            }
        } else {
            throw new MatcherBuildException("类" + patternClass + "不是一个" + PropertyPattern.class.getName() + "类型");
        }

        try {
            return (PropertyPattern) constructor.newInstance(property, pattern);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {

            throw new MatcherBuildException("无法通过构造方法:" + constructor.getName() + "实例化Pattern对象:" + e.getMessage(), e);
        }
    }
}
