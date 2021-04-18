package chapter4;

import chapter4.util.BinaryTreeNode;

public class Question4_2_MinimalTree {
    public static void main(String[] argv) {
        int[] input =  new int[] {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = input.length - 1;
        BinaryTreeNode head = createBinarySearchTreeFromArray(input, start, end);
        inOrderTraversal(head);
    }

    private static BinaryTreeNode createBinarySearchTreeFromArray(int[] input, int start, int end) {
        if(start > end) {
            return null;
        }
        int middleIndex = (start + end) / 2;
        int value = input[middleIndex];
        BinaryTreeNode current = new BinaryTreeNode(value);
        current.left = createBinarySearchTreeFromArray(input, start, middleIndex - 1);
        current.right = createBinarySearchTreeFromArray(input, middleIndex + 1, end);

        return current;
    }

    public static void inOrderTraversal(BinaryTreeNode node) {
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }
}
