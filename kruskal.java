import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}


class kruskal {
    int[] parent;

    int find(int v) {
        if (parent[v] != v) {
            parent[v] = find(parent[v]); // Path compression
        }
        return parent[v];
    }

    void union(int v1, int v2) {
        parent[find(v1)] = find(v2);
    }

    List<Edge> kruskalMST(List<Edge> edges, int vertices) {
        Collections.sort(edges); // Sort edges by weight
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++)
            parent[i] = i;

        List<Edge> mst = new ArrayList<>();
        for (Edge edge : edges) {
            if (find(edge.src) != find(edge.dest)) {
                mst.add(edge);
                union(edge.src, edge.dest);
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 10), new Edge(0, 2, 6), new Edge(0, 3, 5),
                new Edge(1, 3, 15), new Edge(2, 3, 4));

        kruskal kruskal = new kruskal();
        List<Edge> mst = kruskal.kruskalMST(edges, 4);

        System.out.println("Edges in the MST:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + ": " + edge.weight);
        }
    }
}
