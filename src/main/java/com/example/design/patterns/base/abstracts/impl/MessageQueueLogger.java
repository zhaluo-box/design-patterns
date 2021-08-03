package com.example.design.patterns.base.abstracts.impl;

import com.example.design.patterns.base.abstracts.Logger;

import java.io.IOException;
import java.util.logging.Level;

/**
 * @Description:
 * @Date: 2021/7/20 12:50
 */
public class MessageQueueLogger extends Logger {

    private MessageQueueClient msgQueueClient;

    public MessageQueueLogger(String name, boolean enabled,
                              Level minPermittedLevel, MessageQueueClient msgQueueClient) {
        super(name, enabled, minPermittedLevel);
        this.msgQueueClient = msgQueueClient;
        System.out.println("MessageQueueLogger 实例构造器 ");
    }

    @Override
    protected void doLog(Level level, String mesage) {
        // 格式化level和message,输出到消息中间件
        msgQueueClient.send("...");
    }

    public static class  MessageQueueClient{

        public void send(String message){
            // 发送日志
        }
    }
}
