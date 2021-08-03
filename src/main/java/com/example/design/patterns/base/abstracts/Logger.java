package com.example.design.patterns.base.abstracts;

import java.io.IOException;
import java.util.logging.Level;

/**
 * @Description:
 * @Date: 2021/7/20 12:42
 */
public abstract class Logger {

    private String name;
    private boolean enabled;
    private Level minPermittedLevel;
    public Logger(String name, boolean enabled, Level minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
        System.out.println("抽象类 Logger  构造器! ");
    }

    public void log(Level level, String message) throws IOException {
        boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
        if (!loggable) return;
        doLog(level, message);
    }

    /**
     * 被子类继承使用.抽象方法必须实现
     * @param level 等级.
     * @param message 消息.
     */
    protected abstract void doLog(Level level, String message) throws IOException;
}
