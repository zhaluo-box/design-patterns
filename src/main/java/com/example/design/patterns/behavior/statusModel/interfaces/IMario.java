package com.example.design.patterns.behavior.statusModel.interfaces;

import com.example.design.patterns.behavior.statusModel.entity.State;

/**
 * @Description:
 * @Date: 2021/8/3 16:13
 */
public interface IMario {
    State getName();
    //以下是定义的事件
    void obtainMushRoom();
    void obtainCape();
    void obtainFireFlower();
    void meetMonster();
}
