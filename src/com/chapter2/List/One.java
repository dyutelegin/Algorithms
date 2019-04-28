package com.chapter2.List;

import java.util.Hashtable;

public class One {
    public static class LinkedListNode {
            int data;
            LinkedListNode next;

    public LinkedListNode(int data){
                this.data = data;
                next = null;
            }

        }
public static void main(String[] args){
    LinkedListNode head = new LinkedListNode(1);
    LinkedListNode node1 = new LinkedListNode(2);
    LinkedListNode node2 = new LinkedListNode(3);
    head.next =node1;
    node1.next =node2;
    deleteDups(head);
}

        public static void deleteDups(LinkedListNode n){
            Hashtable table = new Hashtable();
            LinkedListNode previous = null;
            while(n != null ){
                if(table.containsKey(n.data)) {
                    previous.next = n.next;
                } else{
                    table.put(n.data, true);
                    previous = n;
                }
                n = n.next;
            }
        }
}
