package com.curtain.study._3struct._7proxy;

import java.net.URL;

/**
 * @author Curtain
 * @date 2018/7/24 10:07
 */
public class HighResolutionImage implements Image {
    private URL imageURL;
    private long startTime;
    private int height;
    private int width;

    @Override
    public void showImage() {
        System.out.println("Real Image:" + imageURL);
    }

    public HighResolutionImage(URL imageURL){
        this.imageURL = imageURL;
        this.startTime = System.currentTimeMillis();
        this.width=600;
        this.height=600;
    }

    public boolean isLoad(){
        long endTime = System.currentTimeMillis();
        return endTime - startTime>3000;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
