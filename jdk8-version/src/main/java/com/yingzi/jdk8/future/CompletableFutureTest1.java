package com.yingzi.jdk8.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author yingzi
 * @date 2024/5/4 13:29
 */
public class CompletableFutureTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable runnable = () -> System.out.println("无返回结果异步任务");
        CompletableFuture.runAsync(runnable);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("有返回值的异步任务");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello World";
        });
        String result = future.get();
        System.out.println(result);

    }
}
