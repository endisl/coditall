package dsa;

import java.util.ArrayDeque;
import java.util.HashSet;

public class GraphBFS {

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
