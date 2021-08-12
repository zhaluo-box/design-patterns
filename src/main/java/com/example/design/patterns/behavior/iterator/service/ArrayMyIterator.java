package com.example.design.patterns.behavior.iterator.service;

import com.example.design.patterns.behavior.iterator.interfaces.MyIterator;

import java.util.ArrayList;

/**
 * @Description:
 * @Date: 2021/8/4 10:08
 */
public class ArrayMyIterator<E> implements MyIterator<E> {

    private int cursor;

    private ArrayList<E> arrayList;

    public ArrayMyIterator(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayMyIterator(int cursor, ArrayList<E> arrayList) {
        this.cursor = cursor;
        this.arrayList = arrayList;
    }



    @Override
    public boolean hasNext() {
        return this.cursor != arrayList.size(); //注意这里，cursor在指向最后一个元素的时候，hasNext()仍旧返回true。
    }

    @Override
    public void next() {
        this.cursor++;
    }

    @Override
    public E currentItem() {
        return arrayList.get(this.cursor);
    }
}
