package com.example.design.patterns.behavior.statusModel.service;

import com.example.design.patterns.behavior.statusModel.entity.State;
import com.example.design.patterns.behavior.statusModel.interfaces.IMario;

/**
 * @Description:
 * @Date: 2021/8/3 16:15
 */
public class SmallMario implements IMario {

    private MarioStateMachine3 stateMachine;
    public SmallMario(MarioStateMachine3 stateMachine) {
        this.stateMachine = stateMachine;
    }
    @Override
    public State getName() {
        return State.SMALL;
    }
    @Override
    public void obtainMushRoom() {
        stateMachine.setCurrentState(new SuperMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 100);
    }
    @Override
    public void obtainCape() {
//        stateMachine.setCurrentState(new CapeMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 200);
    }
    @Override
    public void obtainFireFlower() {
//        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() + 300);
    }
    @Override
    public void meetMonster() {
        // do nothing...
    }
}
