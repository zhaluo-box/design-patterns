package com.example.design.patterns.base.abstracts;

/**
 * @Description: 抽象类
 * @Date: 2021/7/19 12:59
 */
public abstract class AbstractFilter {



    private String name;

    static {
        System.out.println("抽象类静态代码块");
    }

    public AbstractFilter() {
        System.out.println("抽象类构造器[无参]");
    }

    protected abstract void doFilter();

    protected abstract void preFilter();

    protected abstract void postFilter();


    public void handle(){
        System.out.println("抽象类实例方法");
        System.out.println("抽象类 this.name" +this.name);
    }


    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }


}
