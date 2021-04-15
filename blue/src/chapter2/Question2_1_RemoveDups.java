package chapter2;

import chapter2.util.Node;

import java.util.HashSet;
import java.util.Set;

import static chapter2.util.Node.getHeadNode;
import static chapter2.util.Node.printLinkedList;

public class Question2_1_RemoveDups {
    public static void main(String[] argv) {
        Node head = getHeadNode();
        printLinkedList(head);
        removeDuplicatesFromList(head);
        System.out.println("After removing duplicates:");
        printLinkedList(head);
    }

    private static void removeDuplicatesFromList(Node head) {
        Node current = head;
        Node previous = null;
        Set<Integer> values = new HashSet<>();
        while(current != null) {
            if(values.contains(current.data) ) {
                previous.next = current.next;
            } else {
                values.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}
