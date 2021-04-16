package chapter2;

import chapter2.util.Node;

import static chapter2.util.Node.printLinkedList;

public class Question2_6_Palindrome {
    public static void main(String[] argv) {
        Node head = createInputNode();
        printLinkedList(head);
        System.out.println("Is list a palindrome: " + isPalindrome(head));
        System.out.println("=============================================");
        head = createInputNode2();
        printLinkedList(head);
        System.out.println("Is list a palindrome: " + isPalindrome(head));
    }

    private static boolean isPalindrome(Node head) {
        Node reversed = reverseLinkedList(head);
        System.out.println("Reversed list:");
        printLinkedList(reversed);
        return areEqual(head, reversed);
    }

    private static Node reverseLinkedList(Node head) {
        Node reversedHead = null;
        Node current = head;
        while(current != null) {
            Node tempNode = new Node(current.data);
            if(reversedHead == null) {
                reversedHead = tempNode;
            } else {
                tempNode.next = reversedHead;
                reversedHead = tempNode;
            }
            current = current.next;
        }
        return reversedHead;
    }

    private static boolean areEqual(Node head, Node reversed) {
        Node headCurrent = head;
        Node reversedCurrent = reversed;
        while(headCurrent != null) {
            if(headCurrent.data != reversedCurrent.data) {
                return false;
            }
            headCurrent = headCurrent.next;
            reversedCurrent = reversedCurrent.next;
        }

        return true;
    }

    private static Node createInputNode() {
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
