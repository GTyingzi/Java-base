package com.yingzi.jdk8.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author yingzi
 * @date 2024/5/4 13:55
 */
public class CompletableFutureTest3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            int result = 100;
//            System.out.println("第一次运算：" + result);
//            return result;
//        }).thenApply(number -> {
//            int result = number * 3;
//            System.out.println("第二次运算：" + result);
//            return result;
//        });
//
//        Integer val = future.get();
//        System.out.println(val);

//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//                    int result = 100;
//                    System.out.println("第一次运算：" + result);
//                    return result;
//                })
//                .thenCompose(number -> CompletableFuture.supplyAsync(() -> {
//                    int result = number * 3;
//                    System.out.println("第二次运算：" + result);
//                    return result;
//                }));
//        Integer val = future.get();
//        System.out.println(val);

//        CompletableFuture<Void> future = CompletableFuture
//                .supplyAsync(() -> {
//                    int result = 100;
//                    System.out.println("第一次运算：" + result);
//                    return result;
//                }).thenAccept(number ->
//                        System.out.println("第二次运算：" + number * 3));
//        CompletableFuture<Integer> futrue1 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(3) + 1;
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务1结果：" + number);
//            return number;
//        });
//
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(3) + 1;
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务2结果：" + number);
//            return number;
//        });
//
//        CompletableFuture<Void> combinedFuture = futrue1.thenAcceptBoth(future2, (x, y) -> System.out.println("最终结果：" + (x + y)));
//        combinedFuture.join();

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(10);
//            System.out.println("第一阶段：" + number);
//            return number;
//        }).thenRun(() ->
//                System.out.println("thenRun 执行"));

//        CompletableFuture<Integer> future1 = CompletableFuture
//                .supplyAsync(() -> {
//                    int number = new Random().nextInt(10);
//                    System.out.println("任务1结果：" + number);
//                    return number;
//                });
//        CompletableFuture<Integer> future2 = CompletableFuture
//                .supplyAsync(() -> {
//                    int number = new Random().nextInt(10);
//                    System.out.println("任务2结果：" + number);
//                    return number;
//                });
//        CompletableFuture<Integer> result = future1.thenCombine(future2, (x, y) -> x + y);
//        System.out.println("组合后结果：" + result.get());

//        CompletableFuture<Integer> future1 = CompletableFuture
//                .supplyAsync(() -> {
//                    int number = new Random().nextInt(10);
//                    try {
//                        TimeUnit.SECONDS.sleep(number);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("任务1结果:" + number);
//                    return number;
//                });
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(10);
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务2结果:" + number);
//            return number;
//        });
//
//        CompletableFuture<Integer> future = future1.applyToEither(future2, number -> {
//            System.out.println("最快结果：" + number);
//            return number * 2;
//        });
//        Integer val = future.get();
//        System.out.println("返回结果：" + val);

//        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                int number = new Random().nextInt(10) + 1;
//                try {
//                    TimeUnit.SECONDS.sleep(number);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("第一阶段：" + number);
//                return number;
//            }
//        });
//
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(10) + 1;
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("第二阶段：" + number);
//            return number;
//        });
//
//        CompletableFuture<Void> future = future1.acceptEither(future2, number -> System.out.println("最快结果：" + number));
//        future.join();

//        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(5);
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务1结果：" + number);
//            return number;
//        });
//
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
//            int number = new Random().nextInt(5);
//            try {
//                TimeUnit.SECONDS.sleep(number);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务2结果:" + number);
//            return number;
//        });
//
//        future1.runAfterEither(future2, () -> System.out.println("已经有一个任务完成了")).join();


//        Random random = new Random();
//        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(random.nextInt(5));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "hello";
//        });
//
//        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(random.nextInt(1));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "world";
//        });
//        CompletableFuture<Object> result = CompletableFuture.anyOf(future1, future2);
//        Object o = result.get();
//        System.out.println(o);

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("future1完成！");
            return "future1完成！";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("future2完成！");
            return "future2完成！";
        });

        CompletableFuture<Void> combindFuture = CompletableFuture.allOf(future1, future2);
        combindFuture.join();

    }
}
