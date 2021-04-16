package chapter2;

import chapter2.util.Node;

import java.util.HashMap;
import java.util.Map;

import static chapter2.util.Node.printLinkedList;

public class Question2_7_Intersection {
    public static void main(String[] argv) {
        Node[] nodes = createInputNodes();
        printLinkedList(nodes[0]);
        printLinkedList(nodes[1]);
        int result = findIntersection(nodes);
        System.out.println("Intersection is: " + (result != -1 ? result : "Not found"));
        System.out.println("================================================");
        nodes = new Node[] {createInputNode1(), createInputNode2()};
        printLinkedList(nodes[0]);
        printLinkedList(nodes[1]);
        result = findIntersection(nodes);
        System.out.println("Intersection is: " + (result != -1 ? result : "Not found"));
    }

    private static int findIntersection(Node[] nodes) { ;
        Node current1 = nodes[0];
        Node current2 = nodes[1];
        Map<Node, Integer> nodeMap = new HashMap<>();

        while(current1 != null) {
            nodeMap.put(current1, current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            if(nodeMap.containsKey(current2)) {
                return current2.data;
            }
            current2 = current2.next;
        }

        return -1;
    }

    private static Node[] createInputNodes() {
        Node head1 = new Node(1);
        Node head2 = new Node(100);
        head2.next = new Node(200);
        head1.next = new Node(2);
        head2.next.next = head1.next;
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);

        return new Node[]{ head1, head2 };
    }

    private static Node createInputNode1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
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
