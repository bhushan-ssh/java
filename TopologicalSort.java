import java.util.*;

public class TopologicalSort {

    private int vertices;
    private List<List<Integer>> graph;

    public TopologicalSort(int vertices) {
        this.vertices = vertices;
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        graph.get(source).add(destination);
    }

    public void topologicalSort() {

        int[] inDegree = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            for (int neighbor : graph.get(i)) {
                inDegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {

            int current = queue.poll();
            result.add(current);

            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;

                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (result.size() != vertices) {
            System.out.println("Graph contains a cycle.");
            return;
        }

        System.out.println("Topological Order:");
        for (int node : result) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TopologicalSort graph = new TopologicalSort(6);

        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        graph.topologicalSort();
    }
}