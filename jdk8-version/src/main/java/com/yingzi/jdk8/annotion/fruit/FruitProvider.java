package com.yingzi.jdk8.annotion.fruit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yingzi
 * @date 2024/4/19 17:02
 * 水果供应商的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    int id() default -1;

    String name() default "";

    String address() default "";
}
