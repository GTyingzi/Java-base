package com.yingzi.jdk8.annotion.user_Constraint;


import com.yingzi.jdk8.annotion.user.InitSex;

/**
 * @author yingzi
 * @date 2024/4/19 17:23
 */
public class User {

    private String name;
    @ConstraintValidateAge(min = 20, max = 35)
    private int age = 40;
    @InitSex(sex = InitSex.SEX_TYPE.WOMAN)
    private String sex;
}
