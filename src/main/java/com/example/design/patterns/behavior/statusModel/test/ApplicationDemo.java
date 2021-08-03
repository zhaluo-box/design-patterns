package com.example.design.patterns.behavior.statusModel.test;

import com.example.design.patterns.behavior.statusModel.entity.State;
import com.example.design.patterns.behavior.statusModel.service.MarioStateMachine;

/**
 * @Description:
 * @Date: 2021/8/3 15:52
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
