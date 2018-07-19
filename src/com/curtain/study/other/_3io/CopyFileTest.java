package com.curtain.study.other._3io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author Curtain
 * @date 2018/7/18 14:26
 */
public class CopyFileTest {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    nio();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }

    /**
     * 1.读取一个字节就写入一个字节（正在的每次读写操作都会调用cpu去执行）   数据如果大  耗时基本无法完成
     * 2.读取一个数组大小如 byte[1024] （这样一次性读取 或写入1024字节）  再写入。 得到了一定的提升
     * 3.使用缓冲流包装（读和写都先到一个缓冲区中  最后再调用cpu去执行）     速度最快，减少了多次的cpu io调用
     *
     * @throws IOException
     */
    private static void io() throws IOException {
        Long startTime = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("T:/1.txt");
        FileOutputStream fos = new FileOutputStream("T:/2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
//            int k = -1;
        byte[] bytes = new byte[1024];
        while (bis.read(bytes) != -1) {
            bos.write(bytes);
        }
        fis.close();
        fos.close();
        System.out.println("普通文件流 io用时：" + String.valueOf(System.currentTimeMillis() - startTime));
    }

    private static void nio() throws IOException {
        Long startTime = System.currentTimeMillis();
        FileInputStream fin = new FileInputStream("T:/1.txt");      /* 获取源文件的输入字节流 */
        FileChannel fcin = fin.getChannel();                 /* 获取输入字节流的文件通道 */
        FileOutputStream fout = new FileOutputStream("T:/2.txt");  /* 获取目标文件的输出字节流 */
        FileChannel fcout = fout.getChannel();               /* 获取输出字节流的通道 */
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024); /* 为缓冲区分配 1024 个字节 */
        while (fcin.read(buffer) != -1) {        /* 从输入通道中读取数据到缓冲区中 read() 返回 -1 表示 EOF */
            buffer.flip();                                   /* 切换读写 */
            fcout.write(buffer);                             /* 把缓冲区的内容写入输出文件中 */
            buffer.clear();                                  /* 清空缓冲区 */
        }
        System.out.println("普通文件流 io用时：" + String.valueOf(System.currentTimeMillis() - startTime));
    }
}
