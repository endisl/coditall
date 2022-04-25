package dsa;

import java.util.*;

public class CurrencyConverter {

    public static double[] convert(String[][] currencies, double[] values, String[][] queries) {
        // Build graph
        Map<String, Map<String, Double>> graph = buildGraph(currencies, values);
        double[] result = new double[queries.length];
        for (int i = 0; i < queries.length; i ++) {
            result[i] = getPathWeight(queries[i][0], queries[i][1], graph);
        }
        return result;
    }

    private static class Entry {
        private String key;
        private double value;

        public Entry(String key, double value) {
            this.key = key;
            this.value = value;
        }
    }

    //bfs
    private static double getPathWeight(String start, String end, Map<String, Map<String, Double>> graph) {
        //reject
        if (!graph.containsKey(start) || !graph.containsKey(end))
            return -1.;
        //same existing node
        if (graph.containsKey(start) && start.equals(end))
            return 1.;
        //accept
        if (graph.get(start).containsKey(end))
            return graph.get(start).get(end);

        Set<String> visited = new HashSet<>();
        Queue<Entry> queue = new ArrayDeque<>();
        queue.add(new Entry(start, 1.0));

        while (!queue.isEmpty()) {
            var current = queue.remove();
            var currentKey = current.key;
            var currentvalue = current.value;

            if (currentKey == end)
                return currentvalue;
            visited.add(currentKey);

            for (var neighbor : graph.get(currentKey).entrySet()) {
                if (!visited.contains(neighbor.getKey()))
                    queue.add(new Entry(neighbor.getKey(), currentvalue * neighbor.getValue()));
            }
        }
        return -1.;
    }

    private static Path getPath(String start, String end, Map<String, Map<String, Double>> graph) {
        Map<String, String> previousNodes = new HashMap<>();

        //reject
        if (!graph.containsKey(start) || !graph.containsKey(end))
            return null;
        //same existing node
        if (graph.containsKey(start) && start.equals(end)) {
            previousNodes.put(start, end);
            return buildPath(previousNodes, end);
        }

        //accept
        if (graph.get(start).containsKey(end)){
            previousNodes.put(start, end);
            return buildPath(previousNodes, end);
        }

        Set<String> visited = new HashSet<>();
        Queue<Entry> queue = new ArrayDeque<>();
        queue.add(new Entry(start, 1.0));

        while (!queue.isEmpty()) {
            var current = queue.remove();
            var currentKey = current.key;
            var currentvalue = current.value;

            if (currentKey == end)
                return buildPath(previousNodes, end);
            visited.add(currentKey);

            for (var neighbor : graph.get(currentKey).entrySet()) {
                var neighborKey = neighbor.getKey();
                if (!visited.contains(neighborKey)) {
                    queue.add(new Entry(neighborKey, currentvalue * neighbor.getValue()));
                    previousNodes.put(neighborKey, currentKey);
                }
            }
        }
        return buildPath(null, "");
    }

    private static Path buildPath(Map<String, String> previousNodes, String end) {
        Stack<String> stack = new Stack<>();
        stack.push(end);
        var previous = previousNodes.get(end);
        while (previous != null) {
            stack.push(previous);
            previous = previousNodes.get(previous);
        }
        var path = new Path();
        while (!stack.isEmpty())
            path.add(stack.pop());

        return path;
    }

    private static class Path {
        private List<String> nodes = new ArrayList<>();

        public void add(String node) {
            nodes.add(node);
        }

        @Override
        public String toString() {
            return nodes.toString();
        }
    }

    private static Map<String, Map<String, Double>> buildGraph(String[][] currencies, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String x, y;

        for (int i = 0; i < currencies.length; i++) {
            x = currencies[i][0];
            y = currencies[i][1];
            graph.putIfAbsent(x, new HashMap<>());
            graph.get(x).put(y, values[i]);
            graph.putIfAbsent(y, new HashMap<>());
            graph.get(y).put(x, 1 / values[i]);
        }
        return graph;
    }
    public static void main(String[] args) {
        String[][] currencies = {{"USD","JPY"}, {"USD","AUD"}, {"JPY","GBP"}};
        double[] values = {110.0, 1.45, 0.0070};
        String[][] queries = {{"GBP","AUD"} };

        var result = CurrencyConverter.convert(currencies, values, queries);
        System.out.println(Arrays.toString(result));
        //Output: [1.88]

        Map<String, Map<String, Double>> graph = buildGraph(currencies, values);
        var path = CurrencyConverter.getPath(queries[0][0], queries[0][1], graph);
        System.out.println(path);
        //[GBP, JPY, USD, AUD]
    }
}

//find path