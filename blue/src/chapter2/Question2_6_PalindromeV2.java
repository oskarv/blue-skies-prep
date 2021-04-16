package chapter2;

import chapter2.util.Node;

import java.util.Stack;

import static chapter2.util.Node.printLinkedList;

public class Question2_6_PalindromeV2 {
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
        Node slowRunner = head;
        Node fastRunner = head;
        Stack<Integer> stack = new Stack<>();
        if(hasOneOrTwoElements(head)) {
            return true;
        }

        while(fastRunner != null && fastRunner.next != null) {
            stack.push(slowRunner.data);
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        if(fastRunner != null) {
            slowRunner = slowRunner.next;
        }

        while (slowRunner != null) {
            if(slowRunner.data != stack.pop()) {
                return false;
            }
            slowRunner = slowRunner.next;
        }

        return true;
    }

    private static boolean hasOneOrTwoElements(Node head) {
        Node current = head;
        int size = 0;
        while (current != null) {
            size ++;
            if(size > 2) {
                return false;
            }
            current = current.next;
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
