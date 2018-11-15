package com.curtain.study.other._7thread;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch 可以实现 join 相同的功能，但是更加的灵活。
 *
 * @author Curtain
 * @date 2018/11/15 15:11
 */
public class CountDownLatchUtil {

    public static void main(String[] args) throws Exception {
        int thread = 3;
        long start = System.currentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(thread);

        for (int i = 0; i < thread; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread run");
                    try {
                        Thread.sleep(2000);
                        //表示state--   表示当前线程任务已完成
                        countDownLatch.countDown();
                        System.out.println("thread end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
       }
        //阻塞  直到state==0  因为初始化有3个线程  所有开始等于3  等到三个线程都调用了countDown   结束当前的阻塞
        countDownLatch.await();
        long stop = System.currentTimeMillis();
        System.out.println("main over total time = " + String.valueOf(stop - start));

    }
}
