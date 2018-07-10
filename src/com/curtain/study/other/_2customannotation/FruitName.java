package com.curtain.study.other._2customannotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * 水果名称注解
 *
 * @author Curtain
 * @date 2018/7/10 16:42
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitName {

    String value() default "";
}
