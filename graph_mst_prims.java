import java.util.ArrayList;
import java.util.PriorityQueue;

public class graph_mst_prims {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,3,30));
        graph[0].add(new Edge(0,2,15));

        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2,3,50));
        graph[2].add(new Edge(2,0,15));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,2,50));
    }

    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }

        public int compareTo(Pair p){
            return this.v-p.v;
        }
    }

    public static void mst(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));

        int cost=0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;

                cost+=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);

                    pq.add(new Pair(e.dest,e.wt));//here we add the destination 
                    //cause we want to visit the unvisited edges to calculate the mst
                }
            }
        }

        System.out.println("Cost is "+cost);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];

        createGraph(graph);

        mst(graph);
    }
}
