package com.example.design.patterns.behavior.chain.abstracts.impl;

import com.example.design.patterns.behavior.chain.abstracts.Handler;

/**
 * @Description:
 * @Date: 2021/8/3 12:10
 */
public class HandlerA extends Handler {

    @Override
    public void handle() {
        System.out.println("职责链 A ");
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
