package chapter4;

import chapter4.util.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

import static chapter4.util.GraphNode.createGraph;

public class Question4_1_RouteBetweenNodes {

    public static void main(String[] argv) {
        GraphNode head = createGraph();
        int valueToFind = 5;
        isThereRouteBetweenNodes(head, valueToFind);
        System.out.println("==============================================");
        valueToFind = 8;
        isThereRouteBetweenNodes(head, valueToFind);
    }

    private static void isThereRouteBetweenNodes(GraphNode head, int valueToFind) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(head);
        head.visited = true;
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            if(current.data == valueToFind) {
                System.out.println("Route Found between '" + head.data + "' and '" + valueToFind + "'!");
                return;
            }
            for(GraphNode childNode : current.adjacent) {
                if(!childNode.visited) {
                    childNode.visited = true;
                    queue.add(childNode);
                }
            }
        }

        System.out.println("404 - There is no route between '" + head.data + "' and '" + valueToFind + "'!");
    }
}
