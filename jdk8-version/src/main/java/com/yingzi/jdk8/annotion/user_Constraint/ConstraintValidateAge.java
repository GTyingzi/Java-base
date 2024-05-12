package com.yingzi.jdk8.annotion.user_Constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yingzi
 * @date 2024/4/19 19:33
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ConstraintValidateAgeValidator.class)
public @interface ConstraintValidateAge {

    int min() default 18;
    int max() default 60;

    String message() default "年龄应处于18-60之间";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
