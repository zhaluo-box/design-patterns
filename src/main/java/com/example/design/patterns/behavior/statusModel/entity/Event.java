package com.example.design.patterns.behavior.statusModel.entity;

/**
 * @Description:
 * @Date: 2021/8/3 16:07
 */
public enum Event {
    GOT_MUSHROOM(0), GOT_CAPE(1), GOT_FIRE(2), MET_MONSTER(3);

    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
