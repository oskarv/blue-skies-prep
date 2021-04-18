package chapter4;

import chapter4.util.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

import static chapter4.util.BinaryTreeNode.createBinaryTree;

public class Question4_5_ValidateBST {
    public static void main(String[] argv) {
        BinaryTreeNode head = createBinaryTree();
        System.out.println("Is BST Valid: " + isValid(head));
        System.out.println("================================");
        head.left.left.left = new BinaryTreeNode(0);
        System.out.println("Is BST Valid: " + isValid(head));
        System.out.println("================================");
        head.data = 1000;
        System.out.println("Is BST Valid: " + isValid(head));
        System.out.println("================================");
        head.data = 4;
        head.left.left.left = new BinaryTreeNode(100);
        System.out.println("Is BST Valid: " + isValid(head));
    }

    private static boolean isValid(BinaryTreeNode head) {
        if(head == null) {
            return false;
        }
        List<Integer> treeAsArray = new ArrayList<>();
        inOrderTraversal(head, treeAsArray);
        for(int i = 0; i < treeAsArray.size() - 1; i++) {
            if(treeAsArray.get(i) > treeAsArray.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    private static void inOrderTraversal(BinaryTreeNode node, List<Integer> treeAsArray) {
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left, treeAsArray);
        treeAsArray.add(node.data);
        inOrderTraversal(node.right, treeAsArray);
    }
}
