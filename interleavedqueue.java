import java.util.LinkedList;
import java.util.Queue;

public class interleavedqueue {
    public static void interleaved(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();

        int size= q.size();

        for(int i=0;i<size/2;i++){//here we do not directly use the q.size by 2 cause the size changes every time
            q1.add(q.remove());
        }

        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        Queue q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleaved(q);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }




    }
}
