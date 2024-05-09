package com.example.lib.linkedList.SinglyLinkedList;

public class DeleteFirstNodeSinglyLL {

    public static void main(String args[]) {
        LinkedListNode head = TraverseLinkedList.createLinkedList();
        LinkedListNode nodeAfterDeletion = deleteFirstNode(head);
        TraverseLinkedList.printLinkedList(nodeAfterDeletion);
    }


    public static LinkedListNode deleteFirstNode(LinkedListNode head) {
        if (head == null)
            return null;

        LinkedListNode newNode = head.next;
        TraverseLinkedList.printLinkedList(newNode);
        return newNode;
    }
}
