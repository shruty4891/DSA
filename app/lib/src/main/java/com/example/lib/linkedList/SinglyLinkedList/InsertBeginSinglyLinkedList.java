package com.example.lib.linkedList.SinglyLinkedList;

//Input: LinkedList = 2->3->4->5,NewNode = 1
//Output: LinkedList = 1->2->3->4->5

//Input: LinkedList = , NewNode = 1
//Output: LinkedList = 1

//Time complexity - O(1)
public class InsertBeginSinglyLinkedList {
    public static void main(String args[]) {
        LinkedListNode headNode = TraverseLinkedList.createLinkedList();
        headNode = insert(3, headNode);
        headNode =  insert(4, headNode);
        headNode =  insert(5, headNode);
        TraverseLinkedList.printLinkedList(headNode);
    }

    public static LinkedListNode insert(int newData, LinkedListNode headNode) {
        LinkedListNode newInsertNode = new LinkedListNode(newData);
        newInsertNode.next = headNode;
        return newInsertNode;
    }
}
