package com.example.design.patterns.behavior.chain.abstracts.impl;

import com.example.design.patterns.behavior.chain.abstracts.Handler;

/**
 * @Date: 2021/8/3 12:14
 */
public class HandlerC extends Handler {
    @Override
    public void handle() {
        System.out.println("职责链 C");
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
