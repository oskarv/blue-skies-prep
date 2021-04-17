package chapter4.util;

public class BinaryTreeNode {
    public Integer data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(Integer data) {
        this.data = data;
    }

    public static BinaryTreeNode createBinaryTree() {
        BinaryTreeNode head = new BinaryTreeNode(4);
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(6);
        head.left = node1;
        head.right = node2;
        BinaryTreeNode node3 = new BinaryTreeNode(1);
        BinaryTreeNode node4 = new BinaryTreeNode(3);
        node1.left = node3;
        node1.right = node4;
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        node2.left = node5;
        node2.right = node6;

        return head;
    }
}
