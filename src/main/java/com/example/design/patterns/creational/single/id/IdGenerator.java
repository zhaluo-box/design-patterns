package com.example.design.patterns.creational.single.id;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by MingZhe on 2021/9/6 16:16:25
 *
 * @author wmz
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(IdGenerator.getInstance().getId());
    }
}
