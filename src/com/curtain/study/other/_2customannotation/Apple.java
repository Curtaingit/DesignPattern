package com.curtain.study.other._2customannotation;

/**
 * @author Curtain
 * @date 2018/7/10 17:17
 */

public class Apple {

    @FruitName("苹果")
    private String name;

    @FruitColor(fruitColor = FruitColor.Color.GREEN)
    private String color;

    @FruitProvider(id = 1, name = "苹果集团", address = "天上")
    private String provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
