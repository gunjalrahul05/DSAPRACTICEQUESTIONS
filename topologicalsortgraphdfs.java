import java.util.ArrayList;
import java.util.Stack;

public class topologicalsortgraphdfs {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void topologicalsort(ArrayList<Edge> graph[]){

        Stack s = new Stack<>();
        boolean visit[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                topologicalsortUtil(graph,i,visit,s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topologicalsortUtil(ArrayList<Edge> graph[],int curr,boolean visit[],Stack s){

        visit[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);

            if(!visit[e.dest]){
                topologicalsortUtil(graph, e.dest, visit, s);
            }
        }
        s.add(curr);
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

        topologicalsort(graph);

    }
}
