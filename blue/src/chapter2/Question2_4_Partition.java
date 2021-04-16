package chapter2;

import chapter2.util.Node;

import static chapter2.util.Node.printLinkedList;

public class Question2_4_Partition {
    public static void main(String[] argv) {
        Node head = createHeadNode();
        printLinkedList(head);
        int partitionValue = 5;
        System.out.println("After partitioning by value '" + partitionValue + "' : ");
        printLinkedList(partition(head, partitionValue));
    }

    private static Node partition(Node head, int partitionValue) {
        Node current = head;
        Node shorterHead = null;
        Node shorterHeadCurrent = null;
        Node greaterHead = null;
        Node greaterHeadCurrent = null;

        while (current != null) {
            if(current.data < partitionValue) {
                if(shorterHead == null) {
                    shorterHead = current;
                    shorterHeadCurrent = shorterHead;
                } else {
                    shorterHeadCurrent.next = current;
                    shorterHeadCurrent = shorterHeadCurrent.next;
                }
            } else {
                if(greaterHead == null) {
                    greaterHead = current;
                    greaterHeadCurrent = greaterHead;
                } else {
                    greaterHeadCurrent.next = current;
                    greaterHeadCurrent = greaterHeadCurrent.next;
                }
            }
            current = current.next;
        }

        if(shorterHead == null) {
            return greaterHead;
        }
        shorterHeadCurrent.next = greaterHead;
        greaterHeadCurrent.next = null;
        return shorterHead;
    }

    private static Node createHeadNode() {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
        return head;
    }
}
