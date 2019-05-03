package com.chapter2.List;

public class Three {
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
        LinkedListNode node2 = new LinkedListNode(9);
        LinkedListNode node3 = new LinkedListNode(12);
        deleteElement(node2);
    }

    public static boolean deleteElement(LinkedListNode node){
        if(node == null || node.next == null){
            return false;
        }
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }

}
