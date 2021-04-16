package chapter2;

import chapter2.util.Node;

import java.util.HashMap;
import java.util.Map;

public class Question2_8_LoopDetection {
    public static void main(String[] argv) {
        Node head = createInputNode();
        Integer circular = findCircularNode(head);
        System.out.println("Circular node is: " + (circular != null ? circular : "Not Found!"));

        head = createInputNode2();
        circular = findCircularNode(head);
        System.out.println("Circular node is: " + (circular != null ? circular : "Not Found!"));
    }

    private static Integer findCircularNode(Node head) {
        Node current = head;
        Map<Node, Integer> nodes = new HashMap<>();

        while(current != null) {
            if(nodes.containsKey(current)) {
                return current.data;
            } else {
                nodes.put(current, current.data);
            }
            current = current.next;
        }

        return null;
    }

    private static Node createInputNode() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        Node circuit = new Node(4);
        head.next.next.next = circuit;
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = circuit;
        return head;
    }

    private static Node createInputNode2() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        return head;
    }
}
