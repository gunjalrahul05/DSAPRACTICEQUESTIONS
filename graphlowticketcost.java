import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphlowticketcost {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt = w;
        }
    }
    static class info{
        int v;
        int cost;
        int stop;

        public info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stop=s;
        }
    }
    public static int cheapestFlight(int n,int flights[][],int src,int dest,int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(n, flights,graph);

        Queue<info> q = new LinkedList<>();
        int dist[] = new int[n];

        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        q.add(new info(src, 0, 0));

        while(!q.isEmpty()){
            info curr = q.remove();

            if(curr.stop>k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);

                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(curr.cost+wt<dist[v]&&curr.stop<=k){
                    dist[v] =curr.cost+wt;
                    q.add(new info(v,dist[v],curr.stop+1));
                }
            }

            

        }
        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }

    public static void createGraph(int n,int flights[][],ArrayList<Edge> graph[] ){
        

        for(int i=0;i<n;i++){
            graph[i] = new ArrayList();
        }

        for(int i=0;i<n;i++){
            int scr = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[scr].add(new Edge(scr, dest, wt));
        }
    }
    public static void main(String[] args) {
        
        int n=4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};

        int src=0,dst = 3, k =1;

        System.out.println(cheapestFlight(n, flights, src, dst, k));
    }
}
