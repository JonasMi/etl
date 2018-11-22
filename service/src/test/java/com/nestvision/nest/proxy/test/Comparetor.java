package com.nestvision.nest.proxy.test;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.beanutils.PropertyUtils;

public class Comparetor {

    private Object source;

    private Object target;

    private String path;

    private static Set<Class<?>> primitiveClasses = new HashSet<>();

    private Set<String> ignoneProperties = new HashSet<>();

    static {
        primitiveClasses.add(String.class);
        primitiveClasses.add(Double.class);
        primitiveClasses.add(Float.class);
        primitiveClasses.add(Long.class);
        primitiveClasses.add(Integer.class);
        primitiveClasses.add(Short.class);
        primitiveClasses.add(Character.class);
        primitiveClasses.add(Byte.class);
        primitiveClasses.add(Boolean.class);
        primitiveClasses.add(Void.class);
    }

    public void addIgnoneProperty(String property) {
        ignoneProperties.add(property);
    }

    public Comparetor(Object source, Object target) {

        this.source = source;
        this.target = target;
        this.path = source.getClass().getSimpleName();
    }

    private boolean isPrimitive(Class<?> clazz) {
        boolean isPrimitive = clazz.isPrimitive() || clazz.isEnum();

        if (!isPrimitive) {
            isPrimitive = primitiveClasses.contains(clazz);

        }

        return isPrimitive;
    }

    public boolean compare() {

        boolean same = false;

        Class<?> entityClass = source.getClass();

        if (isPrimitive(entityClass)) {
            same = Objects.equals(source, target);
        } else {

            PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(entityClass);
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String propName = propertyDescriptor.getDisplayName();
                if (!"class".equals(propName) && !"declaringClass".equals(propName)) {
                    String currentPath = this.path + "." + propName;
                    if (ignoneProperties.contains(currentPath)) {

                        continue;
                    }
                    Method readMethod = propertyDescriptor.getReadMethod();
                    try {
                        Object thisProp = readMethod.invoke(source);
                        Object thatProp = readMethod.invoke(target);
                        Comparetor propComparetor = new Comparetor(thisProp, thatProp);
                        propComparetor.path = currentPath;
                        propComparetor.ignoneProperties = ignoneProperties;
                        same = propComparetor.compare();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    if (!same) {
                        break;
                    }
                }

            }
        }
        System.out.println("[" + path + "]的比较结果====>" + (same ? "相同" : "不同") + "[source=" + source + ",target=" + target + "]");
        return same;
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = (Class) String.class.getField("TYPE").get(null);

        System.out.println(clazz.isPrimitive());
    }
}
