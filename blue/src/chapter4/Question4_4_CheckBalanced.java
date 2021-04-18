package chapter4;

import chapter4.util.BinaryTreeNode;

import static chapter4.util.BinaryTreeNode.createBinaryTree;

public class Question4_4_CheckBalanced {
    public static void main(String[] argv) {
        BinaryTreeNode head = createBinaryTree();
        System.out.println("Is BST Balanced: " + isBalanced(head));
        System.out.println("================================");
        head.left.left.left = new BinaryTreeNode(0);
        System.out.println("Is BST Balanced: " + isBalanced(head));
        System.out.println("================================");
        head.left.left.left.left = new BinaryTreeNode(-1);
        System.out.println("Is BST Balanced: " + isBalanced(head));
    }

    private static boolean isBalanced(BinaryTreeNode head) {
        if(head == null) {
            return true;
        }
        int diff = checkHeight(head.left) - checkHeight(head.right);
        System.out.println("Diff is: " + diff);
        if(Math.abs(diff) > 1) {
            return false;
        } else {
            return isBalanced(head.left) && isBalanced(head.right);
        }
    }

    private static int checkHeight(BinaryTreeNode node) {
        if(node == null) {
            return -1;
        }
        return Math.max(checkHeight(node.left), checkHeight(node.right)) + 1;
    }
}
