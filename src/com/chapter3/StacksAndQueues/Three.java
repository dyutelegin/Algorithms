package com.chapter3.StacksAndQueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Three {
    class Stack {
        public int capacity;
        public int size = 0;
        public Stack() {
        }
        public void push(int v) {}
        public void add (Stack stack) {}
        public int pop () {return 0;}

        public Stack(int capacity) {
            this.capacity = capacity;
        }

        public  boolean isFull() {
            return capacity == size;
        }

    }

    class SetOfStack extends Stack {
        ArrayList<Stack> stacks = new ArrayList<>();

        private Stack getLastStack() {
            if (stacks.size() == 0) {
                return null;
            }
            return stacks.get(stacks.size() - 1);
        }

        public void push(int v) {
            Stack last = getLastStack();
            if (last != null && !last.isFull()){
                last.push(v);
            }
            else {
                Stack stack = new Stack(capacity);
                stack.push(v);
                stack.add(stack);
            }
        }

        public int pop() {
            Stack last = getLastStack();
            if (last == null) throw new EmptyStackException();
            int v = last.pop();
            if (last.size == 0)
                stacks.remove(stacks.size() - 1);
            return v;
        }
    }
}
