package com.example.design.patterns.behavior.command;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: wmz
 * @Description:
 * @Date: 2021/8/16 17:46
 */
public class CommandTest {
    public static void main(String[] args) {


    }

    public interface Command {
        void execute();
    }
    public class GotDiamondCommand implements Command {
        // 省略成员变量
        public GotDiamondCommand(/*数据*/) {
            //...
        }
        @Override
        public void execute() {
            // 执行相应的逻辑
        }
    }
    //GotStartCommand/HitObstacleCommand/ArchiveCommand类省略
    public class GameApplication {
        private static final int MAX_HANDLED_REQ_COUNT_PER_LOOP = 100;
        private Queue<Command> queue = new LinkedList<>();
        public void mainloop() {
            while (true) {
                List<CassandraProperties.Request> requests = new ArrayList<>();

                //省略从epoll或者select中获取数据，并封装成Request的逻辑，
                //注意设置超时时间，如果很长时间没有接收到请求，就继续下面的逻辑处理。

//                for (Request request : requests) {
//                    Event event = request.getEvent();
//                    Command command = null;
//                    if (event.equals(Event.GOT_DIAMOND)) {
//                        command = new GotDiamondCommand(/*数据*/);
//                    } else if (event.equals(Event.GOT_STAR)) {
//                        command = new GotStartCommand(/*数据*/);
//                    } else if (event.equals(Event.HIT_OBSTACLE)) {
//                        command = new HitObstacleCommand(/*数据*/);
//                    } else if (event.equals(Event.ARCHIVE)) {
//                        command = new ArchiveCommand(/*数据*/);
//                    } // ...一堆else if...
//                    queue.add(command);
//                }
                int handledCount = 0;
                while (handledCount < MAX_HANDLED_REQ_COUNT_PER_LOOP) {
                    if (queue.isEmpty()) {
                        break;
                    }
                    Command command = queue.poll();
                    command.execute();
                }
            }
        }
    }
}
