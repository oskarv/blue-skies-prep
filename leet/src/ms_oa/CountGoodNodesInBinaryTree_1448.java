package ms_oa;

import ms_oa.util.TreeNode;

import static ms_oa.util.TreeNode.createRootNode;

public class CountGoodNodesInBinaryTree_1448 {
    public static int result = 0;
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] argv) {
        TreeNode rootNode = createRootNode();
        dfs(rootNode, max);
        System.out.println("Number of good nodes: " + result);
    }

    private static void dfs(TreeNode node, int max) {
        if(node == null) {
            return;
        }
        if(node.val >= max) {
            System.out.println("Node: " + node.val);
            result++;
        }
        max = Math.max(max, node.val);
        dfs(node.left, max);
        dfs(node.right, max);
    }
}
