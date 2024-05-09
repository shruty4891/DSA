package com.example.lib.linkedList.circularLinkedList;

import com.example.lib.linkedList.DoublyLinkedList.DoubleLinkedListNode;
import com.example.lib.linkedList.SinglyLinkedList.LinkedListNode;
import com.example.lib.linkedList.SinglyLinkedList.TraverseLinkedList;

public class InsertBeginCircularLinkedList {
    public static void main(String args[]) {
        LinkedListNode head = createCircularLinkedList();
        LinkedListNode newInsertedNode =  insertAtBegin(head);
        TraverseLinkedList.printLinkedList(newInsertedNode);
    }

    public static LinkedListNode createCircularLinkedList() {
        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode first = new LinkedListNode(20);
        LinkedListNode second = new LinkedListNode(30);
        LinkedListNode third = new LinkedListNode(40);
        LinkedListNode fourth = new LinkedListNode(50);

        head.next = first;
        head.next.next = second;
        head.next.next.next = third;
        head.next.next.next.next = fourth;
        head.next.next.next.next.next = head;

        return head;
    }

    public static LinkedListNode insertAtBegin(LinkedListNode head) {
        LinkedListNode newNode = new LinkedListNode(5);

        LinkedListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.next = head;
        currentNode.next = newNode;
        return newNode;
    }
}
