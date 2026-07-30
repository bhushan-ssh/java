public class DisjointSetUnion {

    private int[] parent;
    private int[] rank;

    public DisjointSetUnion(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {

        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            return;
        }

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {

        DisjointSetUnion dsu = new DisjointSetUnion(7);

        dsu.union(0, 1);
        dsu.union(1, 2);
        dsu.union(3, 4);

        System.out.println("0 and 2 connected: " + dsu.connected(0, 2));
        System.out.println("0 and 4 connected: " + dsu.connected(0, 4));

        dsu.union(2, 4);

        System.out.println("0 and 4 connected: " + dsu.connected(0, 4));
    }
}