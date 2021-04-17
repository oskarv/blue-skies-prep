package chapter4;

import chapter4.util.GraphNode;

import static chapter4.util.GraphNode.createGraph;

public class Page108_DepthFirstSearch {

    public static void main(String[] argv) {
        GraphNode head = createGraph();
        depthFirstSearch(head);
    }

    private static void depthFirstSearch(GraphNode head) {
        if(head == null) {
            return;
        }
        visit(head);
        for(GraphNode node : head.adjacent) {
            if(!node.visited) {
                depthFirstSearch(node);
            }
        }
    }

    private static void visit(GraphNode node) {
        System.out.println(node.data);
        node.visited = true;
    }
}
