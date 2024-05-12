package com.yingzi.jdk8.annotion.user_Constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

/**
 * @author yingzi
 * @date 2024/4/19 19:38
 * 年龄校验器
 */
public class ConstraintValidateAgeValidator implements ConstraintValidator<ConstraintValidateAge, Integer> {

    @Override
    public void initialize(ConstraintValidateAge constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        Field[] fields = context.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ConstraintValidateAge.class)) {
                ConstraintValidateAge constraintValidateAge = field.getAnnotation(ConstraintValidateAge.class);
                if (value < constraintValidateAge.min() || value > constraintValidateAge.max()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        throw new IllegalArgumentException("为获取到年龄的注解");
    }
}
