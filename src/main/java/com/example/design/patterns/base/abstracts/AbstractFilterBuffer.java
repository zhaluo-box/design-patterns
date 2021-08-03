package com.example.design.patterns.base.abstracts;

/**
 * @Description:
 * @Date: 2021/7/20 13:14
 */
public abstract class AbstractFilterBuffer extends AbstractFilter {

    static {
        System.out.println("抽象类继承抽象类,无需实现父类的抽象方法");
        System.out.println("实体类也可以彼此继承,但是无法实现多态");
        System.out.println("抽象类实现了一种has-a的关系, 接口是is-a的关系");
    }
}
