package com.example.design.patterns.behavior.chain.abstracts.impl;

import com.example.design.patterns.behavior.chain.abstracts.OptimizedHandler;

/**
 * @Description:
 * @Date: 2021/8/3 14:33
 */
public class OptimizedHandlerC extends OptimizedHandler {

    @Override
    public boolean doHandle() {
        System.out.println(" Optimized Handler  C !");
        return true;
    }
}
