import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class graphbfs {

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt  =w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1,3,1));
        graph[1].add(new Edge(1,0,1));

        graph[2].add(new Edge(2,4,1));
        graph[2].add(new Edge(2,0,1));


        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));


    }

    public static void BFS(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!visited[i]){
                graphBfsutil(graph,visited);
            }
        }

    }

    public static void graphBfsutil(ArrayList<Edge> graphs[],boolean visited[]){
        Queue<Integer> q = new LinkedList();
        q.add(0);

        while(!q.isEmpty()){
            int curr= q.remove();

            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i=0;i<graphs[curr].size();i++){
                    Edge e = graphs[curr].get(i);
                    q.add(e.dest);
                }
            }
            
        }
    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                dfsutil(graph, i, vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge> graph[],int curr,boolean vis[]){

        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                dfsutil(graph, curr, vis);            }
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]){

        if(src==dest){
            return true;
        }

        vis[src]=true;

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);

            if(!vis[e.dest]&&hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];

        createGraph(graph);

        // graphBfs(graph);

        // dfs(graph, 0, new boolean[graph.length]);

        System.out.println(hasPath(graph, 0, 5, new boolean[graph.length]));

    }
}
