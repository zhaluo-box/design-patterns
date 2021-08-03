package com.example.design.patterns.behavior.statusModel.service;

import com.example.design.patterns.behavior.statusModel.entity.Event;
import com.example.design.patterns.behavior.statusModel.entity.State;

import static com.example.design.patterns.behavior.statusModel.entity.State.*;

/**
 * @Description:
 * @Date: 2021/8/3 16:08
 */
public class MarioStateMachine2 {

    private int score;

    private State currentState;

    private static final State[][] transitionTable = { { SUPER, CAPE, FIRE, SMALL }, { SUPER, CAPE, FIRE, SMALL }, { CAPE, CAPE, CAPE, SMALL },
                                                       { FIRE, FIRE, FIRE, SMALL } };

    private static final int[][] actionTable = { { +100, +200, +300, +0 }, { +0, +200, +300, -100 }, { +0, +0, +0, -200 }, { +0, +0, +0, -300 } };

    public MarioStateMachine2() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[stateValue][eventValue];
        this.score += actionTable[stateValue][eventValue];
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}
