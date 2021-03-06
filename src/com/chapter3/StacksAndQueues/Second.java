package com.chapter3.StacksAndQueues;

import java.util.Stack;

public class Second extends Stack<Integer> {
    Stack<Integer> s2;
    public Second() {
        s2 = new Stack<Integer>();
    }

    public void push(int value){
        if (value <= min()){
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        int value = super.pop();
        if (value == min()) {
            s2.pop();
        }
        return value;
    }

    public int min() {
        if (s2.empty()) {
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }
}
