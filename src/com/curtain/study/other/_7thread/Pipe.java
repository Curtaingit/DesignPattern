package com.curtain.study.other._7thread;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 使用管道通信
 * Java 虽说是基于内存通信的，但也可以使用管道通信。
 * 需要注意的是，输入流和输出流需要首先建立连接。这样线程 B 就可以收到线程 A 发出的消息了。
 * 实际开发中可以灵活根据需求选择最适合的线程通信方式。
 *
 * @author Curtain
 * @date 2018/11/15 16:26
 */
public class Pipe {

    public static void main(String[] args) throws IOException {
        //面向于字符 PipedInputStream面向于字节
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();

        //输入输入流建立连接
        writer.connect(reader);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running");
                try {
                    for (int i = 0; i < 10; i++) {
                        writer.write(i);
                        Thread.sleep(10);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running2");
                int msg = 0;
                try {
                    while ((msg = reader.read()) != -1) {
                        System.out.println("msg " + msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread2.start();


    }
}
