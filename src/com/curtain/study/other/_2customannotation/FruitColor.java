package com.curtain.study.other._2customannotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * @author Curtain
 * @date 2018/7/10 16:54
 */

@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * 颜色枚举
     */
    enum Color {
        BLUE, RED, GREEN
    }

    ;

    /**
     * 颜色属性
     *
     * @return 默认GREEN
     */
    Color fruitColor() default Color.GREEN;
}
