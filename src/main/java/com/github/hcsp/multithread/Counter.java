package com.github.hcsp.multithread;

public class Counter {
    private int value = 0;
    final Object lock = new Object();

    public int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public void addAndGet(int i) {
        //采用synchronized方法
        synchronized (lock){
            value += i;
        }
    }

    // 减去一个整数i，并返回减之后的结果
    public void minusAndGet(int i) {
        synchronized (lock){
            value -= i;
        }
    }
}
