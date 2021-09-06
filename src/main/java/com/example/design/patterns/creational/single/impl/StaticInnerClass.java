package com.example.design.patterns.creational.single.impl;

/**
 * SingletonHolder 是一个静态内部类，当外部类被加载的时候，并不会创建 SingletonHolder 实例对象。
 * 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。instance 的唯一性、
 * 创建过程的线程安全性，都由 JVM 来保证。所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    public static StaticInnerClass getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }
}
