package com.chapter2.List;

public class Five {
    public static class LinkedListNode {
        int data;
        LinkedListNode next;

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        public LinkedListNode(){

        }

        public LinkedListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args){

    }

    public static LinkedListNode addList(LinkedListNode node1, LinkedListNode node2, int x){
        if(node1 == null && node2 == null && x == 0){
            return null;
        }
        LinkedListNode result = new LinkedListNode();
        int value = x;
        if(node1 != null){
            value += node1.data;
        }
        if(node2 != null){
            value += node2.data;
        }
        result.data = value %10;

        if(node1 != null || node2 != null){
            LinkedListNode more = addList(node1 == null ? null : node1.next,
                    node2 == null ? null : node2.next,
                    value >= 10 ? 1 : 0);
            result.setNext(more);
        }
        return result;
    }
}
