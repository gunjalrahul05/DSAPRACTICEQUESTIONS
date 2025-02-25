import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class connectnrops {

    public static int connectrows(int arr[]){
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        int res=0;
        while(q.size()>1){
            int first = (int)q.poll();
            int second = (int)q.poll();

            res+=(first+second);
            System.out.println(res);

            q.add(first+second);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};

        System.err.println(connectrows(arr));
        
    }
}
