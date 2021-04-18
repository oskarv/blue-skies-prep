package chapter4;

import chapter4.util.BinaryTreeNode;

import static chapter4.util.BinaryTreeNode.createBinaryTree;

public class Question4_10_CheckSubTree {
    public static void main(String[] argv) {
        BinaryTreeNode headLargeTree = createBinaryTree();
        BinaryTreeNode headSmallTree = createSmallTree();
        System.out.println("Is sub tree: " + isSubTree(headLargeTree, headSmallTree));
        System.out.println("============================================================");
        headLargeTree.left.left.left = new BinaryTreeNode(10);
        System.out.println("Is sub tree: " + isSubTree(headLargeTree, headSmallTree));
    }

    private static boolean isSubTree(BinaryTreeNode headLargeTree, BinaryTreeNode headSmallTree) {
        String largeTree = getStringRepresentation(headLargeTree);
        System.out.println("Large tree: " + largeTree);
        String smallTree = getStringRepresentation(headSmallTree);
        System.out.println("Small tree: " + smallTree);
        return largeTree.contains(smallTree);
    }

    private static String getStringRepresentation(BinaryTreeNode head) {
        StringBuilder result = new StringBuilder();
        preOrderTraversal(head, result);
        return result.toString();
    }

    private static void preOrderTraversal(BinaryTreeNode node, StringBuilder stringRepresentation) {
        if(node == null) {
            stringRepresentation.append("x");
            return;
        }
        stringRepresentation.append(node.data);
        preOrderTraversal(node.left, stringRepresentation);
        preOrderTraversal(node.right, stringRepresentation);
    }

    public static BinaryTreeNode createSmallTree() {
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(1);
        BinaryTreeNode node4 = new BinaryTreeNode(3);
        node1.left = node3;
        node1.right = node4;
        return node1;
    }
}
