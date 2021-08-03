package com.example.design.patterns.behavior.chain.abstracts;

/**
 * @Description:
 * @Date: 2021/8/3 12:07
 */
public abstract class Handler {

    public abstract void handle();

    protected Handler successor; //引用下一个职责, [本质是链表的指针]

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
