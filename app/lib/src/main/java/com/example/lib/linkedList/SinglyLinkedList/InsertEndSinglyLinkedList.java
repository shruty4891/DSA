package com.example.lib.linkedList.SinglyLinkedList;

public class InsertEndSinglyLinkedList {

    public static void main(String args[]) {
        LinkedListNode headNode = TraverseLinkedList.createLinkedList();
        headNode = insertAtEnd(3, headNode);
        headNode = insertAtEnd(4, headNode);
        headNode = insertAtEnd(5, headNode);
        TraverseLinkedList.printLinkedList(headNode);
    }

    public static LinkedListNode insertAtEnd(int data, LinkedListNode head) {
        LinkedListNode node = new LinkedListNode(data);
        if (head == null) return node;
        //currentNode and head now pointing to same object in memory
        LinkedListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return head;
    }
}
