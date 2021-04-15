package chapter2.util;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public static void printLinkedList(Node head) {
        System.out.print("head -> " + head.data + " -> ");
        Node current = head;
        while (current.next != null) {
            current = current.next;
            System.out.print(current.data + " -> ");
        }
        System.out.println("tail.");
    }

    public static Node getHeadNode() {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(2);
        return head;
    }
}
