package com.example.design.patterns.behavior.statusModel.interfaces;

import com.example.design.patterns.behavior.statusModel.entity.State;

/**
 * @Description:
 * @Date: 2021/8/3 16:13
 */
public interface IMario {
    State getName();
    //以下是定义的事件

    /**
     * 获得蘑菇
     */
    void obtainMushRoom();

    /**
     * 获得斗篷
     */
    void obtainCape();

    /**
     * 获得火焰花
     */
    void obtainFireFlower();

    /**
     * 遇到怪物
     */
    void meetMonster();
}
