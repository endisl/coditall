package dsa;

import java.util.*;

//LC399
public class EvaluateDivision {

    public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        // Build graph
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] result = new double[queries.length];
        for (int i = 0; i < queries.length; i ++) {
            result[i] = getPathWeight(queries[i][0], queries[i][1], new HashSet<>(), graph);
        }
        return result;
    }

    //dfs
    private static double getPathWeight(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
        //reject
        if (!graph.containsKey(start) || !graph.containsKey(end))
            return -1.;

        //same existing node
        if (graph.containsKey(start) && start.equals(end))
            return 1.;

        //accept
        if (graph.get(start).containsKey(end))
            return graph.get(start).get(end);

        visited.add(start);
        for (var neighbor : graph.get(start).entrySet()) {
            if (!visited.contains(neighbor.getKey())) {
                double productWeight = getPathWeight(neighbor.getKey(), end, visited, graph);
                if (productWeight != -1)
                    return neighbor.getValue() * productWeight;
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
        String[][] equations = {{"a","b"},{"b","c"}};
        double[] values = {2.0,3.0};
        String[][] queries = {{"a","c"},{"b","a"},{"a","e"},{"a","a"},{"x","x"}};

        var result = EvaluateDivision.calcEquation(equations, values, queries);
        System.out.println(Arrays.toString(result));
        //output: [6.0, 0.5, -1.0, 1.0, -1.0]
    }
}
