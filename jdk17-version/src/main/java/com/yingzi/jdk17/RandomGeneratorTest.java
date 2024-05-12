package com.yingzi.jdk17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * @author yingzi
 * @date 2024/5/12 17:25
 * 增强的随机数生成器
 */
public class RandomGeneratorTest {

    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> l128X256MixRandom = RandomGeneratorFactory.of("L128X256MixRandom");
        // 随机数种子
        long seed = 42L;
        RandomGenerator randomGenerator = l128X256MixRandom.create(seed);
        // 生成随机数
        int val = randomGenerator.nextInt(5);
        System.out.println(val);


    }
}
