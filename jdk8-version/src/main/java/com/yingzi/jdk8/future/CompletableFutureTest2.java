package com.yingzi.jdk8.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @author yingzi
 * @date 2024/5/4 13:43
 */
public class CompletableFutureTest2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
            }
            if (new Random().nextInt(10) % 2 == 0) {
                int i = 12 / 0;
            }
            System.out.println("执行结束！");
            return "test";
        });

        // 任务完成或异常时执行该任务，若出现了异常，任务结果为null
        future.whenComplete(new BiConsumer<String, Throwable>() {
            @Override
            public void accept(String s, Throwable throwable) {
                System.out.println(s + "执行完成！");
            }
        });
        // 出现异常时先执行该方法
        future.exceptionally(new Function<Throwable, String>() {
            @Override
            public String apply(Throwable throwable) {
                System.out.println("执行失败：" + throwable.getMessage());
                return "异常xxxx";
            }
        });

        String s = future.get();
    }
}
