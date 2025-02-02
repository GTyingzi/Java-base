package com.yingzi.jdk8.annotion.fruit;

/**
 * @author yingzi
 * @date 2024/4/19 17:03
 */

/**
 * 注解使用
 */
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;
}
