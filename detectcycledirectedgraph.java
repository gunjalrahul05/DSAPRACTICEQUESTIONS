import java.util.ArrayList;

public class detectcycledirectedgraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean visit[] = new boolean[graph.length];
        boolean recStack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                if (isCycleUtil(graph, i, visit, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean visit[], boolean recStack[]) {
        visit[curr] = true;
        recStack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (recStack[e.dest]) {
                return true;
            }
            if (!visit[e.dest] && isCycleUtil(graph, e.dest, visit, recStack)) {
                return false;
            }
        }
        recStack[curr] = false;
        return false;

    }

    public static void main(String[] args) {

        ArrayList<Edge> graph[] = new ArrayList[4];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

        System.out.println(isCycle(graph));
    }
}
