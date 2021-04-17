package chapter4.util;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public Integer data;
    public boolean visited = false;
    public List<GraphNode> adjacent = new ArrayList<>();

    public GraphNode(Integer data) {
        this.data = data;
    }

    public static GraphNode createGraph() {
        GraphNode head = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);

        head.adjacent.add(node1);
        head.adjacent.add(node2);
        node1.adjacent.add(node3);
        node1.adjacent.add(node4);
        node1.adjacent.add(node5);
        node4.adjacent.add(node6);
        node6.adjacent.add(head);

        return head;
    }
}
