package com.nestvision.nest.proxy.fhir.anotaion;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ FIELD })
@Retention(RUNTIME)
public @interface FhirFieldValidate {

    public String name();

    public String displayName() default "";

    public boolean required() default false;

    public int minLength() default 0;

    public int maxLength() default Integer.MAX_VALUE;

    public String valuesRange() default "";
}
