package com.example.design.patterns.behavior.statusModel.service;

import com.example.design.patterns.behavior.statusModel.entity.State;
import com.example.design.patterns.behavior.statusModel.interfaces.IMario;

/**
 * @Description:
 * @Date: 2021/8/3 16:20
 */
public class MarioStateMachine3 {
    private int score;
    private IMario currentState; // 不再使用枚举来表示状态
    public MarioStateMachine3() {
        this.score = 0;
        this.currentState = new SmallMario(this);
    }
    public void obtainMushRoom() {
        this.currentState.obtainMushRoom();
    }
    public void obtainCape() {
        this.currentState.obtainCape();
    }
    public void obtainFireFlower() {
        this.currentState.obtainFireFlower();
    }
    public void meetMonster() {
        this.currentState.meetMonster();
    }
    public int getScore() {
        return this.score;
    }
    public State getCurrentState() {
        return this.currentState.getName();
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }
}
