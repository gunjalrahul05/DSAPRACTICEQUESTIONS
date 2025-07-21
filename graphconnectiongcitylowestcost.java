import java.util.PriorityQueue;

public class graphconnectiongcitylowestcost {

    static class Edge{
        int dest;
        int cost;

        public Edge(int dest,int cost){
            this.dest=dest;
            this.cost=cost;
        }
    }

    public static int connectCities(int cities[][]){

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];
        int finalCost=0;

        pq.add(new Edge(0, 0));

        while(!pq.isEmpty()){
            Edge e = pq.remove();

            if(!vis[e.dest]){
                vi
            }
        }
    }
    public static void main(String[] args) {
        int cities[][] ={{0,1,2,3,4},
                         {1,0,5,0,7},
                         {2,5,0,6,0},
                         {3,0,6,0,0},
                         {4,7,0,0,0}};
    }
}
