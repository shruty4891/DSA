package com.example.lib.linkedList.DoublyLinkedList;

import com.example.lib.linkedList.SinglyLinkedList.LinkedListNode;
import com.example.lib.linkedList.SinglyLinkedList.TraverseLinkedList;

public class InsertBeginDoublyLL {
    public static void main(String args[]) {
        LinkedListNode head = TraverseLinkedList.createLinkedList();

        DoubleLinkedListNode nodeAfterInsertion= insertAtBegin(null);
        DoublyLinkedList.printDoubleLinkedListNode(nodeAfterInsertion);
    }

    public static DoubleLinkedListNode insertAtBegin(DoubleLinkedListNode head) {
        DoubleLinkedListNode d = new DoubleLinkedListNode(1000);
        if(head == null){
            return d;
        }
        head.previous =  d;
        d.next = head;
        return d;

    }
}
