package com.example.lib.linkedList.SinglyLinkedList;

//Time Complexity: O(n)
//Space Complexity: O(1)
public class SearchSinglyLinkedList {
    public static void main(String args[]) {
        LinkedListNode head = TraverseLinkedList.createLinkedList();
        System.out.println(searchSinglyLinkedList(head));
    }


    public static int searchSinglyLinkedList(LinkedListNode head) {
        if (head == null) {
            System.out.println("Head is Null");
            return -1;
        }
        int position = 1;
        LinkedListNode currentNode = head;
        while (currentNode != null) {

            if (currentNode.data == 10) {
                return position;
            }
            currentNode = currentNode.next;
            position++;
        }
        return -1;
    }

}
