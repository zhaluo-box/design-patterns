package com.example.design.patterns.behavior.statusModel.entity;

import lombok.Getter;

/**
 * 行为状态
 * 2021/8/3 15:50
 */
@Getter
public enum State {
    SMALL(0), // 小马里奥
    SUPER(1), // 超级马里奥
    FIRE(2), // 火焰马里奥
    CAPE(3); // 斗篷马里奥

    private final int value;

    State(int value) {
        this.value = value;
    }

}
