package com.curtain.study.other._7thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier 中文名叫做屏障或者是栅栏，也可以用于线程间通信。
 * 它可以等待 N 个线程都达到某个状态后继续运行的效果。
 * 1.首先初始化线程参与者。
 * 2.调用 await() 将会在所有参与者线程都调用之前等待。
 * 3.直到所有参与者都调用了 await() 后，所有线程从 await() 返回继续后续逻辑。
 *
 * @author Curtain
 * @date 2018/11/15 15:56
 */
public class CyclicBarrierUtil {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"thread run");
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"thread end");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"thread run");
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"thread end");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"thread run");
                try {
                    Thread.sleep(5000);
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"thread end");
            }
        }).start();

        System.out.println("main thread");
    }
}
