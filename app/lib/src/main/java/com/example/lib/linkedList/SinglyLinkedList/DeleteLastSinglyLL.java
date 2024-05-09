package com.example.lib.linkedList.SinglyLinkedList;

public class DeleteLastSinglyLL {
    public static void main(String args[]) {
        LinkedListNode head = TraverseLinkedList.createLinkedList();
        LinkedListNode nodeAfterDeletion = deleteLastNode(head);
        TraverseLinkedList.printLinkedList(nodeAfterDeletion);
    }


    public static LinkedListNode deleteLastNode(LinkedListNode head) {
        LinkedListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }
}
