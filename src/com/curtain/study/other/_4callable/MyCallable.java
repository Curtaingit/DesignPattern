package com.curtain.study.other._4callable;

import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Curtain
 * @date 2018/7/19 10:37
 */
public class MyCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(20000);
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread thread = new Thread(ft);
        thread.start();
//        Thread.sleep(6000);
        //如果ft数据未准备好 那么进入阻塞状态，直到ft返回数据
        System.out.println(ft.get());

        System.out.println("哈哈哈哈");
    }
}
