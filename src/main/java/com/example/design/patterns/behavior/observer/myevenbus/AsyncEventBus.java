package com.example.design.patterns.behavior.observer.myevenbus;

import java.util.concurrent.Executor;

/**
 * @Description:
 * @Date: 2021/8/2 12:07
 */
public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
    }

}
