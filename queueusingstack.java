import java.util.Stack;

public class queueusingstack {
    static class queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data){
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }

            s1.add(data);

            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }            
            return s1.pop();
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }  
            
            return s1.peek();
        }
    }

    public static void main(String[] args) {

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
