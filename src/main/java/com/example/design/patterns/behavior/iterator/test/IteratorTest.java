package com.example.design.patterns.behavior.iterator.test;

import com.example.design.patterns.behavior.iterator.interfaces.MyIterator;
import com.example.design.patterns.behavior.iterator.service.ArrayMyIterator;
import com.example.design.patterns.behavior.iterator.service.MyArrayList;

import java.util.ArrayList;

/**
 * @Description:
 * @Date: 2021/8/4 10:21
 */
public class IteratorTest {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

//        MyIterator<String> myIterator = new ArrayMyIterator<>(names);
        MyIterator myIterator = names.iterator1();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.currentItem());
            myIterator.next();
        }
    }
}
