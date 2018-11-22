package com.nestvision.nest.proxy.test;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateUtils;

import com.nestvision.nest.proxy.base.entity.BaseEntity;

public class EntityGenarator {

    private static final int DATE_POOL_SIZE = 50;

    private static final List<Date> DATE_POOL = new ArrayList<>(DATE_POOL_SIZE);
    static {
        Date now = new Date();
        for (int i = 0; i < DATE_POOL_SIZE; i++) {
            int dif = i + 1;
            DATE_POOL.add(DateUtils.addDays(now, -dif));
        }
    }

    private static Date randomDate() {
        int index = RandomUtils.nextInt(0, DATE_POOL_SIZE);
        return DATE_POOL.get(index);
    }

    private static Object genarateValue(PropertyDescriptor propertyDescriptor) throws Exception {

        Class<?> propertyType = propertyDescriptor.getPropertyType();
        if (propertyType.equals(String.class)) {
            return propertyDescriptor.getName();
        }
        if (propertyType.equals(Date.class)) {
            return randomDate();
        }
        if (propertyType.equals(Integer.class)) {
            return RandomUtils.nextInt(0, 100);
        }
        if (propertyType.equals(Long.class)) {
            return RandomUtils.nextLong(0l, 100l);
        }
        if (propertyType.equals(Float.class)) {
            return RandomUtils.nextFloat(0.00f, 100.00f);
        }
        if (propertyType.equals(Double.class)) {
            return RandomUtils.nextDouble(0.00d, 100.00d);
        }
        if (propertyType.equals(Boolean.class)) {
            return Boolean.TRUE;
        }
        if (propertyType.isEnum()) {
            Object[] a = propertyType.getEnumConstants();
            if (a != null && a.length > 0) {
                int index = RandomUtils.nextInt(0, a.length);
                return a[index];
            }

        }
        if (propertyType.isAssignableFrom(BaseEntity.class)) {

            return genarate(propertyType);
        }

        return null;
    }

    public static <T> T genarateNessaray(Class<T> clazz) throws Exception {

        T object = clazz.newInstance();

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(object);

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {

            boolean isNesaray = isNesaray(clazz, propertyDescriptor);

            if (isNesaray) {

                Method writeMethod = propertyDescriptor.getWriteMethod();

                if (writeMethod != null) {

                    Object value = genarateValue(propertyDescriptor);

                    writeMethod.invoke(object, value);
                }
            }
        }
        return object;
    }

    private static Field getDeclaredField(Class<?> clazz, String name) {

        while (clazz != Object.class) {
            try {
                Field field = clazz.getDeclaredField(name);
                return field;
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
            }
        }
        return null;

    }

    private static boolean isNesaray(Class<?> clazz, PropertyDescriptor propertyDescriptor) throws Exception {

        Class<?> propertyType = propertyDescriptor.getPropertyType();

        if (propertyType.isAssignableFrom(BaseEntity.class)) {

            return true;
        }

        Field field = getDeclaredField(clazz, propertyDescriptor.getName());

        if (field != null) {

            Column column = field.getDeclaredAnnotation(Column.class);

            if (column != null) {

                return !column.nullable();
            }
        }

        return false;
    }

    public static <T> T genarate(Class<T> clazz) throws Exception {

        T object = clazz.newInstance();

        PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(object);

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {

            Method writeMethod = propertyDescriptor.getWriteMethod();
            if (writeMethod != null) {
                Object value = genarateValue(propertyDescriptor);
                writeMethod.invoke(object, value);
            }

        }

        return object;
    }
    
    
    public static <T> T genarate(Class<T> clazz, boolean full) throws Exception {
        T fhirResourceEntity = null;
        if (full) {
            fhirResourceEntity = genarate(clazz);
        } else {
            fhirResourceEntity = genarateNessaray(clazz);
        }
        return fhirResourceEntity;
    }
}
