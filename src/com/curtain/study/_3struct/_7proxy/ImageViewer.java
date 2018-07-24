package com.curtain.study._3struct._7proxy;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 代理模式
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * 解决：在直接访问对象时带来的问题，比如说：要访问的对象在远程的机器上。在面向对象系统中，
 *      有些对象由于某些原因（比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
 *      直接访问会给使用者或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 * @author Curtain
 * @date 2018/7/24 10:17
 */
public class ImageViewer {
    public static void main(String[] args) throws MalformedURLException {
        String image = "http://image.jpg";
        URL url = new URL(image);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
