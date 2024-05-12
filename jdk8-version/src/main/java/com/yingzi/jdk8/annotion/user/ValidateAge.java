package com.yingzi.jdk8.annotion.user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yingzi
 * @date 2024/4/19 17:22
 * 年龄的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateAge {

    int min() default 18;

    int max() default 60;

    int value() default 20;
}
