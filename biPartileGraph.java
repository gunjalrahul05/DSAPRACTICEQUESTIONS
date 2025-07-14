import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class biPartileGraph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int color[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<color.length;i++){
            color[i] = -1;
        }
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                color[i] = 0;
                q.add(i);

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);

                        if(color[e.dest]==-1){
                            int nextCol = color[curr]==0?1:0;
                            color[e.dest] = nextCol;
                            q.add(e.dest);
                        }else if(color[e.dest]==color[curr]){
                            return false;
                        }

                    }
                }

                return true;

            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));

        System.out.println(isBipartite(graph));
    }
}
