package com.example.design.patterns.behavior.iterator.interfaces;

/**
 * @Description:
 * @Date: 2021/8/4 9:59
 */
public interface MyIterator<E> {
    /**
     * 是否有下一个值
     * @return
     */
    boolean hasNext();
    void next();
    E currentItem();
}
