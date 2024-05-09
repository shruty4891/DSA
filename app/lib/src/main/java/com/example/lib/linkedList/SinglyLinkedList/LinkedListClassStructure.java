package com.example.lib.linkedList.SinglyLinkedList;

public class LinkedListClassStructure {
    public static void main(String args[]) {
        System.out.println("tt");

    }

    public void createLinkedList() {
        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode next1 = new LinkedListNode(20);
        LinkedListNode next2 = new LinkedListNode(30);
        LinkedListNode next3 = new LinkedListNode(40);

//        10->null 20 ->null 30->null 40->null

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
//        10(head)->reference of 20, 20 ->reference of 30, 30->nreference of 40, null 40->null
        System.out.println(head.data);
    }
}