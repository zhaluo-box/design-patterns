package com.example.design.patterns.behavior.observer.myevenbus;

import com.google.common.annotations.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
runtime  运行时
method  方法上
 */

/**
 * @Description:
 * @Date: 2021/8/2 11:49
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {
}
