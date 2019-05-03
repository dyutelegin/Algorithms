package com.chapter2.List;

public class Four {
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
        submission(head,5);
    }

    public static LinkedListNode submission (LinkedListNode node, int k){
        LinkedListNode head = node;
        LinkedListNode nodeN = node;

        while (node != null){
            LinkedListNode next = node.next;
            if(node.data < k){
                node.next = head;
                head = node;
            }
            else {
                nodeN.next = node;
                nodeN = node;
            }
            node = next;
        }
        nodeN.next = null;
        return head;
    }
}
