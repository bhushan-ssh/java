import java.util.*;

class Edge {
    int destination;
    int weight;

    Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

class Pair implements Comparable<Pair> {
    int vertex;
    int distance;

    Pair(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.distance, other.distance);
    }
}

public class DijkstraAlgorithm {

    private int vertices;
    private List<List<Edge>> graph;

    public DijkstraAlgorithm(int vertices) {
        this.vertices = vertices;
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        graph.get(source).add(new Edge(destination, weight));
    }

    public void dijkstra(int source) {

        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        distance[source] = 0;
        pq.offer(new Pair(source, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            if (current.distance > distance[current.vertex]) {
                continue;
            }

            for (Edge edge : graph.get(current.vertex)) {

                int newDistance = distance[current.vertex] + edge.weight;

                if (newDistance < distance[edge.destination]) {
                    distance[edge.destination] = newDistance;
                    pq.offer(new Pair(edge.destination, newDistance));
                }
            }
        }

        System.out.println("Shortest Distances from Source " + source + ":");

        for (int i = 0; i < vertices; i++) {
            System.out.println(source + " -> " + i + " = " + distance[i]);
        }
    }

    public static void main(String[] args) {

        DijkstraAlgorithm graph = new DijkstraAlgorithm(5);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);

        graph.dijkstra(0);
    }
}