package com.curtain.study._2behavior._7observer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 观察者模式（Observer）
 * 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 * 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。
 *
 * 天气数据布告板会在天气信息发生改变时更新其内容，布告板有多个，并且在将来会继续增加。
 * WeatherData为Subject   StatisticsDisplay 和 CurrentConditionDisplay为Observer(多个天气预告板)
 * WeatherData更新数据时 会告诉所有注册的Observer
 * @author Curtain
 * @date 2018/7/12 15:12
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(37.5f,20.2f,1000.0f);

        weatherData.setMeasurements(7.5f,1.2f,1.0f);
    }
}
