import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversefirstnelentqueue {

    public static void reverse(Queue<Integer> q,int n){

        if(q.size()==0||n>q.size()){
            return;
        }
        Stack s = new Stack<>();

        int size = q.size();
        for(int i=0;i<n;i++){
            s.add(q.remove());
        }

        while(!s.isEmpty()){
            q.add((int)s.pop());
        }
        for(int i=0;i<size-n;i++){
            q.add((int)q.remove());
        }
    }
    public static void main(String[] args) {
        Queue q = new LinkedList<>();


        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverse(q, 4);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
