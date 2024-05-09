package com.example.lib.linkedList.SinglyLinkedList;

public class InsertGivenPositionSinglyLinkedList {
    public static void main(String args[]) {
        LinkedListNode headNode = TraverseLinkedList.createLinkedList();
        headNode = insertAtGivenPosition(6, 7, headNode);
//        headNode =  insertAtGivenPosition(4,3, headNode);
//        headNode =  insertAtGivenPosition(5,3, headNode);
        TraverseLinkedList.printLinkedList(headNode);
    }

    public static LinkedListNode insertAtGivenPosition(int newData, int position, LinkedListNode headNode) {
        LinkedListNode newInsertNode = new LinkedListNode(newData);
        LinkedListNode currentNode = headNode;
        if (position == 1) {
            newInsertNode.next = headNode;
            return newInsertNode;
        }
        while (position - 2 > 0 && currentNode!=null) {
            //3
            currentNode = currentNode.next;
            position--;
        }
        //If someone passed position beyond the size of linkedList
        if (currentNode == null) {
            return headNode;
        }

        newInsertNode.next = currentNode.next;
        currentNode.next = newInsertNode;

        return headNode;
    }

}
