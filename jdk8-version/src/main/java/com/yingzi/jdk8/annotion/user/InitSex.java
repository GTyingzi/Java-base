package com.yingzi.jdk8.annotion.user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yingzi
 * @date 2024/4/19 17:21
 * 性别的注解
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InitSex {

    enum SEX_TYPE {MAN, WOMAN}

    SEX_TYPE sex() default SEX_TYPE.MAN;
}
