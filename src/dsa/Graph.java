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

    public void dfs(String root) {
        var node = nodes.get(root);
        if (node == null)
            return;

        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            var current = stack.pop();
            if (visited.contains(current))
                continue;

            System.out.println(current);
            visited.add(current);

            for (var neighbor : adjacencyList.get(current)) {
                if (!visited.contains(neighbor))
                    stack.push(neighbor);
            }
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

    //check first to see if the graph is DAG (Directed Acyclic Graph)
    public List<String> topologicalSort() {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();

        for (var node : nodes.values())
            topologicalSort(node, stack, visited);

        List<String> sorted = new ArrayList<>();
        while (!stack.isEmpty())
            sorted.add(stack.pop().label);

        return sorted;
    }

    public void topologicalSort(Node node, Stack<Node> stack, Set<Node> visited) {
        if (visited.contains(node))
            return;
        visited.add(node);

        for (var neighbor : adjacencyList.get(node)) {
            if (!visited.contains(neighbor))
                topologicalSort(neighbor, stack, visited);
        }

        stack.push(node);
    }
}
