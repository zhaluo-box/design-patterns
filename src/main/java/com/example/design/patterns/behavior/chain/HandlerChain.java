package com.example.design.patterns.behavior.chain;

import com.example.design.patterns.behavior.chain.abstracts.Handler;

/**
 * @Description:
 * @Date: 2021/8/3 12:17
 */
public class HandlerChain {
    private Handler head = null;

    private Handler tail = null; // 只是做一个引用的替换, 起到了一个中间值的作用

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
