import java.util.ArrayList;
import java.util.Stack;

public class graphSCC {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 1, 0));

        graph[3].add(new Edge(3, 4, 0));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        vis[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void toposort(ArrayList<Edge> graph[], boolean vis[], Stack<Integer> s, int curr) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                toposort(graph, vis, s, e.dest);
            }
        }

        s.add(curr);
    }

    public static void kosaRaju(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack();
        // step 1
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                toposort(graph, vis, s, i);
            }
        }

        // step 2 reverse the graph

        ArrayList<Edge> transpose[] = new ArrayList[V];

        for (int i = 0; i < transpose.length; i++) {
            transpose[i] = new ArrayList<Edge>();
            vis[i] = false;
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);

                transpose[e.dest].add(new Edge(e.dest, e.src, e.wt));
            }
        }

        // step 3 apply dfs according to the stack

        while (!s.isEmpty()) {
            int curr = s.pop();

            if (!vis[curr]) {
                dfs(transpose, curr, vis);
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        createGraph(graph);
        kosaRaju(graph, 5);
    }
}
