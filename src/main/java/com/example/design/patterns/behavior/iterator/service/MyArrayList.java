package com.example.design.patterns.behavior.iterator.service;

import com.example.design.patterns.behavior.iterator.interfaces.MyIterator;
import com.example.design.patterns.behavior.iterator.interfaces.MyList;

import java.util.ArrayList;

/**
 * @Description:
 * @Date: 2021/8/4 10:40
 */
public class MyArrayList<E> extends ArrayList<E> implements MyList<E> {
    @Override
    public MyIterator iterator1() {
        return new ArrayMyIterator(this);
    }
}
