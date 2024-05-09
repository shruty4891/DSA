package com.example.lib.linkedList.SinglyLinkedList;

//Time Complexity - o(n)
public class TraverseLinkedList {
    public static void main(String args[]) {
        LinkedListNode head = createLinkedList();
        System.out.println(printLinkedList(head));
    }

    public static LinkedListNode createLinkedList() {
        LinkedListNode head = new LinkedListNode(10);
        LinkedListNode next1 = new LinkedListNode(20);
        LinkedListNode next2 = new LinkedListNode(30);
        LinkedListNode next3 = new LinkedListNode(40);
        LinkedListNode next4 = new LinkedListNode(50);

        head.next = next1;
        head.next.next = next2;
        head.next.next.next = next3;
        head.next.next.next.next = next4;

        return head;
    }




    public static int printLinkedList(LinkedListNode head) {
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);
//        System.out.println(head.next.next.next.next.data);

        //Optimized Code
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
//                System.out.println(currentNode.data);
            currentNode = currentNode.next;
            position++;
        }
        return -1;
    }
}
