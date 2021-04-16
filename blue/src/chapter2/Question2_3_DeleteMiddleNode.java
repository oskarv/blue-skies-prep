package chapter2;

import chapter2.util.Node;

import static chapter2.util.Node.getHeadNode;
import static chapter2.util.Node.printLinkedList;

public class Question2_3_DeleteMiddleNode {
    public static void main(String[] argv) {
        Node head = getHeadNode();
        printLinkedList(head);
        deleteMiddleNode(head.next.next.next);
        printLinkedList(head);
    }

    private static void deleteMiddleNode(Node middleNode) {
        Node nextNode = middleNode.next;
        middleNode.data = nextNode.data;
        middleNode.next = nextNode.next;
    }
}
