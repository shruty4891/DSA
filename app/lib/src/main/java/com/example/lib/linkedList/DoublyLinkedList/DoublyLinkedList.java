package com.example.lib.linkedList.DoublyLinkedList;

public class DoublyLinkedList {

    public static void main(String args[]) {
        DoubleLinkedListNode head = createDoublyLL();
        printDoubleLinkedListNode(head);
    }

    public static DoubleLinkedListNode createDoublyLL() {
        DoubleLinkedListNode head = new DoubleLinkedListNode(10);
        DoubleLinkedListNode first = new DoubleLinkedListNode(20);
        DoubleLinkedListNode second = new DoubleLinkedListNode(30);
        DoubleLinkedListNode third = new DoubleLinkedListNode(40);

        head.next = first;
        first.next = second;
        first.previous = head;
        second.next = third;
        second.previous = first;

        return head;
    }

    public static void printDoubleLinkedListNode(DoubleLinkedListNode head) {
        DoubleLinkedListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
