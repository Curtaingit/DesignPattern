package com.curtain.study.other._2customannotation;

import java.lang.annotation.*;

/**
 * 水果供应者
 *
 * @author Curtain
 * @date 2018/7/10 17:01
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    /**
     * 编号
     *
     * @return 默认 -1
     */
    int id() default -1;

    /**
     * 名称
     *
     * @return 默认 ""
     */
    String name() default "";

    /**
     * 地址
     *
     * @return 默认""
     */
    String address() default "";
}
