package com.chapter2.List;

public class Two {
    public static class LinkedListNode {
        int data;
        LinkedListNode next;

        public LinkedListNode(int data){
            this.data = data;
            next = null;
        }

    }

    public static void main(String[] args){
        LinkedListNode head = new LinkedListNode(5);
        LinkedListNode node1 = new LinkedListNode(3);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(7);
//        head.next =node1;
//        node1.next =node2;
//        node2.next = node3;
        algorithm(head, 1);
    }

    public static int algorithm(LinkedListNode head, int k){
        if(head == null){
            return 0;
        }
        int index = algorithm(head.next, k) + 1;
        if(index == k){
            System.out.println(k+" k element is: "+ head.data);
        }
        return index;
    }
}
