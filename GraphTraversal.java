import java.util.*;

public class GraphTraversal {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    public GraphTraversal(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS: ");
        dfsHelper(startVertex, visited);
        System.out.println();
    }

    private void dfsHelper(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        GraphTraversal graph = new GraphTraversal(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.dfs(0);
        graph.bfs(0);
    }
}