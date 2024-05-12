package com.yingzi.jdk8.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author yingzi
 * @date 2024/5/4 12:29
 * FutureTask测试
 */
public class FutureTaskTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // 创建任务T2的FutureTask
        FutureTask<String> ft2 = new FutureTask<>(new T2Task());
        // 创建任务T1的FutureTask
        FutureTask<String> ft1 = new FutureTask<>(new T1Task(ft2));

        // 线程T1执行任务ft1
        Thread T1 = new Thread(ft1);
        T1.start();
        // 线程T2执行任务ft2
        Thread T2 = new Thread(ft2);
        T2.start();
        // 等待线程T1执行结果
        try {
            System.out.println(ft1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start) + "ms");
    }
}

/**
 * T1Task需要执行的任务：洗水壶、烧开水、泡茶
 */
class T1Task implements Callable<String> {

    FutureTask<String> ft2;

    // T1任务需要T2任务的FutureTask
    T1Task(FutureTask<String> ft2) {
        this.ft2 = ft2;
    }

    @Override
    public String call() throws Exception {
        System.out.println("T1:洗水壶...");
        Thread.sleep(1000);
        System.out.println("T1:烧开水...");
        Thread.sleep(15000);
        // 获取T2线程的茶叶
        String tf = ft2.get();
        System.out.println("T1:拿到茶叶:" + tf);
        System.out.println("T1:泡茶...");
        return "上茶:" + tf;
    }
}

/**
 * T2Task需要执行的任务：洗茶壶、洗茶杯、拿茶叶
 */
class T2Task implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("T2:洗茶壶...");
        Thread.sleep(1000);
        System.out.println("T2:洗茶杯...");
        Thread.sleep(2000);
        System.out.println("T2:拿茶叶...");
        Thread.sleep(1000);
        return "龙井";
    }
}
