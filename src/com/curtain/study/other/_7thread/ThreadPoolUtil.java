package com.curtain.study.other._7thread;

import java.util.concurrent.*;

/**
 * 用线程池来管理线程
 *
 * @author Curtain
 * @date 2018/11/15 16:12
 */
public class ThreadPoolUtil {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(10);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5,5,1, TimeUnit.MILLISECONDS,queue);
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("running2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //调用了 shutdown() 之后线程池会停止接受新任务，并且会平滑的关闭线程池中现有的任务。
        poolExecutor.shutdown();
        //等待任务执行完毕  一秒判断一次
        while(!poolExecutor.awaitTermination(1,TimeUnit.SECONDS)){
            System.out.println("线程还在运行");
        }
        System.out.println("over");
    }
}
