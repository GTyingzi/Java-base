package com.yingzi.jdk8.annotion.user;

import java.lang.reflect.Field;

/**
 * @author yingzi
 * @date 2024/4/19 17:24
 */
public class UserInfoUtil {

    public static void initUser(User user) throws IllegalAccessException {
        // 获取User类中的所有属性（getFields无法获取到private的属性）
        Field[] fields = User.class.getDeclaredFields();
        // 遍历所有属性
        for (Field field : fields) {
            // 如果属性上有此注解，则进行赋值操作
            if (field.isAnnotationPresent(InitSex.class)) {
                // 获取属性上的注解
                InitSex initSex = field.getAnnotation(InitSex.class);
                field.setAccessible(true);
                // 设置属性的性别值
                field.set(user, initSex.toString());
                System.out.println("完成属性值的修改，修改值为:" + initSex.sex().toString());
            }
            if (field.isAnnotationPresent(ValidateAge.class)) {
                // 获取属性上的注解
                ValidateAge validateAge = field.getAnnotation(ValidateAge.class);
                field.setAccessible(true);
                int age = (int) field.get(user);
                if (age < validateAge.min() || age > validateAge.max()) {
                    throw new IllegalArgumentException("年龄不合法");
                } else {
                    System.out.println("年龄合法");
                }

            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        initUser(user);

    }
}
