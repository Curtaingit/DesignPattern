package com.curtain.study._1creational._3builder;

/**
 * @author Curtain
 * @date 2018/7/4 9:25
 */
public class Client {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            stringBuilder.append((char) ('a' + i));
        }
        System.out.println(stringBuilder.toString());
    }
}
