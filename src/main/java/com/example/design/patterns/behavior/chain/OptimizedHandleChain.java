package com.example.design.patterns.behavior.chain;

import com.example.design.patterns.behavior.chain.abstracts.OptimizedHandler;

/**
 * @Description:
 * @Date: 2021/8/3 14:38
 */

public class OptimizedHandleChain {
    private OptimizedHandler headHandler;

    private OptimizedHandler tailHandler;

    public void addHandler(OptimizedHandler handler) {
        handler.setSuccessor(null);
        if (headHandler == null) {
            headHandler = handler;
            tailHandler = handler;
        }
        tailHandler.setSuccessor(handler);
        tailHandler = handler;
    }

    public void handle() {
        if (headHandler != null) {
            headHandler.handle();
        }
    }

}
