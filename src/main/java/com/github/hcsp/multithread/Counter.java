package com.github.hcsp.multithread;

public class Counter {
    private int value = 0;

    public int getValue() {
        return value;
    }

    
    private Lock lock = new ReentrantLock();
    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        lock.lock();
        try {
            value += i;
        } finally {
            lock.unlock();
        }
        return value;
    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        lock.lock();
        try {
            value -= i;
        } finally {
            lock.unlock();
        }
        return value;
    }

}
