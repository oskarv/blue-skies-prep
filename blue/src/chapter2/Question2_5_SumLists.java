package chapter2;

import chapter2.util.Node;

import static chapter2.util.Node.printLinkedList;

public class Question2_5_SumLists {
    public static void main(String[] argv) {
        Node number1 = createFirstNumber();
        Node number2 = createSecondNumber();
        System.out.println("First Number: ");
        printLinkedList(number1);
        System.out.println("Second Number: ");
        printLinkedList(number2);
        System.out.println("First Number + Second Number = ");
        printLinkedList(summarizeLists(number1, number2));
    }

    private static Node summarizeLists(Node number1, Node number2) {
        Node result = null;
        Node resultCurrent = null;
        Node currentNum1 = number1;
        Node currentNum2 = number2;
        int carryOver = 0;

        // todo: if numbers are not equal length fill shorter number with zero "0" value nodes
        while(currentNum1 != null) {
            int sum = currentNum1.data + currentNum2.data + carryOver;
            carryOver = 0;
            if(sum > 9) {
                carryOver++;
            }
            sum = sum % 10;

            if(result == null) {
                result = new Node(sum);
                resultCurrent = result;
            } else {
                resultCurrent.next = new Node(sum);
                resultCurrent = resultCurrent.next;
            }

            currentNum1 = currentNum1.next;
            currentNum2 = currentNum2.next;
        }

        return result;
    }

    private static Node createFirstNumber() {
        Node head = new Node(7);
        head.next = new Node(1);
        head.next.next = new Node(6);
        return head;
    }

    private static Node createSecondNumber() {
        Node head = new Node(5);
        head.next = new Node(9);
        head.next.next = new Node(2);
        return head;
    }
}
