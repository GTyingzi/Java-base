package com.yingzi.jdk8.annotion.fruit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yingzi
 * @date 2024/4/19 17:00
 * 水果颜色的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {

    public enum Color{BLUE,RED,GREEN};

    Color fruitColor() default Color.GREEN;
}
