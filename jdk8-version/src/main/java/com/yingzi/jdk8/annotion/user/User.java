package com.yingzi.jdk8.annotion.user;

/**
 * @author yingzi
 * @date 2024/4/19 17:23
 */
public class User {

    private String name;
    @ValidateAge(min = 20, max = 35, value = 22)
    private int age = 30;
    @InitSex(sex = InitSex.SEX_TYPE.WOMAN)
    private String sex;
}
