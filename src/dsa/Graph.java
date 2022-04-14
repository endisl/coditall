package dsa;

import java.util.*;

public class Graph {
    private class Node {
        private String label;
        public Node(String label) {
            this.label = label;
        }
        @Override
        public String toString() {
            return label;
        }
    }
    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();
        adjacencyList.get(fromNode).add(toNode);
    }

    public void print() {
        for (var source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);
        }
    }

    public void bfs(String root) {
        var node = nodes.get(root);
        if (root == null)
            return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            var current = queue.remove();
            if (visited.contains(current))
                continue;
            System.out.println(current);
            visited.add(current);

            for (var neighnour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
    }
}
