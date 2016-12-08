package com.iflyer.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解拦截器
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface LoggerAnnotation {

    /**  类名*/
    String className();

    /**  方法名*/
    String methodName();

    /**  第几级，controller为1级，被controller调用的为第二级，以此类推*/
    int level();

}

