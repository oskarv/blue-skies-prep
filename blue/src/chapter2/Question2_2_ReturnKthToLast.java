package chapter2;

import chapter2.util.Node;

import static chapter2.util.Node.getHeadNode;
import static chapter2.util.Node.printLinkedList;

public class Question2_2_ReturnKthToLast {
    public static void main(String[] argv) {
        Node head = getHeadNode();
        int k = 2;
        printLinkedList(head);
        System.out.print(k + "th to last element is: " + findKthToLast(head, k));
    }

    private static int findKthToLast(Node head, int k) {
        Node current = head;
        Node kth = head;

        for(int i = 0; i < k; i++) {
            current = current.next;
        }

        while(current != null) {
            current = current.next;
            kth = kth.next;
        }

        return kth.data;
    }
}
