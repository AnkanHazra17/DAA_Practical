
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adjacencyList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjacencyList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public List<Integer> dfs(int start, int goal) {
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[adjacencyList.size()];
        dfsRecursive(start, goal, visited, path);
        return path.isEmpty() ? null : path;
    }

    private boolean dfsRecursive(int node, int goal, boolean[] visited, List<Integer> path) {
        visited[node] = true;
        path.add(node);

        if (node == goal) {
            return true;
        }

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor] && dfsRecursive(neighbor, goal, visited, path)) {
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }
}

public class Solution {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        int start = 0;
        int goal = 5;

        List<Integer> path = graph.dfs(start, goal);

        if (path != null) {
            System.out.println("Path from " + start + " to " + goal + ": " + path);
        } else {
            System.out.println("No path found from " + start + " to " + goal);
        }
    }
}
