package com.github.hcsp.multithread;

public class Counter {
    private int value = 0;

    public syncnoize int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public syncnoize int addAndGet(int i) {
        value += i;
        return value;
    }

    // 减去一个整数i，并返回减之后的结果
    public syncnoize int minusAndGet(int i) {
        value -= i;
        return value;
    }
}
