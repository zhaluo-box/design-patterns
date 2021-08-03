package com.example.design.patterns.behavior.chain.abstracts;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/8/3 14:30
 */
public abstract class OptimizedHandler {

    protected OptimizedHandler successor;

    public void setSuccessor(OptimizedHandler successor) {
        this.successor = successor;
    }

    public void handle() {
        boolean handled = doHandle();
        if (handled && null != successor) {
            successor.handle();
        }
    }

    public abstract boolean doHandle();

}
