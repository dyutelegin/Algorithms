package com.chapter3.StacksAndQueues;

import java.util.Stack;

public class Five {
    Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> r = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!r.isEmpty() && r.peek() > temp) {
                stack.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }
}
