package com.example.design.patterns.behavior.chain;

import com.example.design.patterns.behavior.chain.abstracts.OptimizedHandler;
import com.example.design.patterns.behavior.chain.abstracts.impl.*;

/**
 * @Description:
 * @Date: 2021/8/3 12:18
 */
public class ChainTest {
    public static void main(String[] args) {
    //    chainTest();
        OptimizedHandleChain handleChain = new OptimizedHandleChain();
        handleChain.addHandler(new OptimizedHandlerA());
        handleChain.addHandler(new OptimizedHandlerB());
        handleChain.addHandler(new OptimizedHandlerC());
        handleChain.handle();
    }

    private static void chainTest() {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.addHandler(new HandlerC());
        chain.handle();
    }

}
