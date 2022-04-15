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

    public void removeNode(String label) {
        var node = nodes.get(label);
        if (node == null)
            return;
        for (var n : adjacencyList.keySet()) {
            adjacencyList.get(n).remove(node);
        }
        adjacencyList.remove(node);
        nodes.remove(label);
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null)
            throw new IllegalArgumentException();
        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null)
            return;
        adjacencyList.get(fromNode).remove(toNode);
    }

    public void print() {
        for (var source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);
        }
    }

    public void dfsRec(String root) {
        var node = nodes.get(root);
        if (node == null)
            return;
        dfsRec(node, new HashSet<>());
    }

    private void dfsRec(Node root, Set<Node> visited) {
        System.out.println(root);
        visited.add(root);

        for (var neighbour : adjacencyList.get(root)) {
            if (!visited.contains(neighbour))
                dfsRec(neighbour, visited);
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

            for (var neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
    }
}
