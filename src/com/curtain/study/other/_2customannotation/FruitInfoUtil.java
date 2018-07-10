package com.curtain.study.other._2customannotation;

import java.lang.reflect.Field;

/**
 * 注解处理器
 *
 * @author Curtain
 * @date 2018/7/10 17:06
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Object o) {
        String strFruitName = "水果名称:";
        String strFruitColor = "水果颜色:";
        String strFruitProvider = "供应商信息:";

        Class clazz = o.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
                //可以泛化Apple  比如  有一个Fruit基类
                ((Apple)o).setName(fruitName.value());
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor();
                System.out.println(strFruitColor);
                ((Apple)o).setColor(fruitColor.fruitColor().toString());
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider + "id:" + fruitProvider.id() + "名称:" + fruitProvider.name() + "地址:" + fruitProvider.address();
                System.out.println(strFruitProvider);
                ((Apple)o).setProvider("id:" + fruitProvider.id() + "名称:" + fruitProvider.name() + "地址:" + fruitProvider.address());
            }

        }
    }
}
