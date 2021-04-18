package chapter4;

import chapter4.util.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

import static chapter4.util.BinaryTreeNode.createBinaryTree;

public class Question4_3_ListOfDepths {
    public static void main(String[] argv) {
        BinaryTreeNode head = createBinaryTree();
        ArrayList<LinkedList<BinaryTreeNode>> lists = createListOfDepths(head);
        lists.forEach(System.out::println);
    }

    private static ArrayList<LinkedList<BinaryTreeNode>> createListOfDepths(BinaryTreeNode head) {
        ArrayList<LinkedList<BinaryTreeNode>> lists = new ArrayList<>();
        LinkedList<BinaryTreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(head);
        while(!currentLevel.isEmpty()) {
            lists.add(currentLevel);
            LinkedList<BinaryTreeNode> parents = currentLevel;
            currentLevel = new LinkedList<>();
            for(BinaryTreeNode node : parents) {
                if(node.right != null) {
                    currentLevel.add(node.right);
                }
                if(node.left != null) {
                    currentLevel.add(node.left);
                }
            }
        }

        return lists;
    }
}
