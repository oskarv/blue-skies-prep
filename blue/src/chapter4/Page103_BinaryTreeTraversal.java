package chapter4;

import chapter4.util.BinaryTreeNode;

import static chapter4.util.BinaryTreeNode.createBinaryTree;

public class Page103_BinaryTreeTraversal {

    public static void main(String[] argv) {
        BinaryTreeNode head = createBinaryTree();
        System.out.println("In Order Traversal: ");
        inOrderTraversal(head);
        System.out.println("Pre Order Traversal: ");
        preOrderTraversal(head);
        System.out.println("Post Order Traversal: ");
        postOrderTraversal(head);
    }

    private static void inOrderTraversal(BinaryTreeNode head) {
        if(head != null) {
            inOrderTraversal(head.left);
            System.out.println(head.data);
            inOrderTraversal(head.right);
        }
    }

    private static void preOrderTraversal(BinaryTreeNode head) {
        if(head != null) {
            System.out.println(head.data);
            preOrderTraversal(head.left);
            preOrderTraversal(head.right);
        }
    }

    private static void postOrderTraversal(BinaryTreeNode head) {
        if(head != null) {
            preOrderTraversal(head.left);
            preOrderTraversal(head.right);
            System.out.println(head.data);
        }
    }
}
