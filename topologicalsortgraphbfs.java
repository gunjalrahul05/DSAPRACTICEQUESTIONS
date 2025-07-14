import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalsortgraphbfs {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void countIndegree(ArrayList<Edge> graph[],int indegree[]){

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        int indegree[] = new int[graph.length];

        countIndegree(graph, indegree);

        Queue<Integer> q = new LinkedList();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr= q.remove();
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;

                if(indegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        bfs(graph);
    }
}
