package chapter4;

import chapter4.util.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

import static chapter4.util.GraphNode.createGraph;

public class Page108_BreadthFirstSearch {

    public static void main(String[] argv) {
        GraphNode head = createGraph();
        breadthFirstSearch(head);
    }

    private static void breadthFirstSearch(GraphNode head) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(head);
        head.visited = true;

        while(!queue.isEmpty()) {
            GraphNode current = queue.poll();
            visit(current);
            for(GraphNode node : current.adjacent) {
                if(!node.visited) {
                    queue.add(node);
                    node.visited = true;
                }
            }
        }
    }

    private static void visit(GraphNode node) {
        System.out.println(node.data);
    }
}
