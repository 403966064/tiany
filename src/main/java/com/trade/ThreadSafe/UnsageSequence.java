package com.trade.ThreadSafe;

public class UnsageSequence {
    private int value;

    public int getNext(){
        return value++;
    }
}
