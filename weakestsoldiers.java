import java.util.PriorityQueue;

public class weakestsoldiers {
    static class node implements Comparable<node>{
        int n;
        int cnt;

        public node(int n,int cnt){
            this.n = n;
            this.cnt = cnt;
        }

        public int compareTo(node n){
            if(this.cnt==n.cnt){
                return this.n - n.n;
            }else{
                return this.cnt-n.cnt;
            }
        }

        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,0,0,0},{1,0,0,0},{1,1,1,1},{1,0,0,0}};
        int k=2;
        PriorityQueue<node> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int n =0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    n++;
                }
            }

            pq.add(new node(i,n));
        }

        for(int i=0;i<k;i++){
            node n = pq.remove();

            System.out.println("Idx"+n.n);
        }
    }
}
