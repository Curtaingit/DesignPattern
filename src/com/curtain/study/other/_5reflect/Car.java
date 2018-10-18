package com.curtain.study.other._5reflect;

/**
 * @author Curtain
 * @date 2018/7/25 14:06
 */
public class Car {
    private String name;
    private String speed;

    public Car(String name, String speed) {
        this.name = name;
        this.speed = speed;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
