package dsa;

import java.util.*;

public class EvaluateDivisionBFS {

    public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        // Build graph
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
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

    private static Map<String, Map<String, Double>> buildGraph(String[][] equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String x, y;

        for (int i = 0; i < equations.length; i++) {
            x = equations[i][0];
            y = equations[i][1];
            graph.putIfAbsent(x, new HashMap<>());
            graph.get(x).put(y, values[i]);
            graph.putIfAbsent(y, new HashMap<>());
            graph.get(y).put(x, 1 / values[i]);
        }
        return graph;
    }

    public static void main(String[] args) {
        //Ex1
        /*String[][] equations = {{"a","b"},{"b","c"}};
        double[] values = {2.0,3.0};
        String[][] queries = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};*/
        //Output = [6.0, 0.5, -1.0, 1.0, -1.0]

        //Ex2
        String[][] equations = {{"a","b"},{"b","c"}, {"bc","cd"}};
        double[] values = {1.5,2.5,5.0};
        String[][] queries = {{"a","c"},{"c","b"},{"bc","cd"},{"cd","bc"}};
        //Output = [3.75000,0.40000,5.00000,0.20000]

        //Ex3
        /*String[][] equations = {{"a","b"}};
        double[] values = {0.5};
        String[][] queries = {{"a","b"},{"b","a"},{"a","c"},{"x","y"}};*/
        //Output = [0.50000,2.00000,-1.00000,-1.00000]


        var result = EvaluateDivision.calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(result));
    }
}
