package com.example.design.patterns.behavior.statusModel.entity;

import lombok.Getter;

/**
 * @Description:
 * @Date: 2021/8/3 16:07
 */
@Getter
public enum Event {
    GOT_MUSHROOM(0), // 变声超级马里奥
    GOT_CAPE(1), // 获得斗篷
    GOT_FIRE(2), // 获得火焰花
    MET_MONSTER(3); // 遇到怪物

    private final int value;

    Event(int value) {
        this.value = value;
    }

}
