import java.util.Deque;
import java.util.LinkedList;


public class queueusingdeque {

    static class Queue{
        Deque queue = new LinkedList();

        public void push(int data){
            queue.addLast(data);
        }
        public int pop(){
            return (int)queue.removeFirst();
        }

        public int peek(){
            return (int)queue.getFirst();
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        
        
    }
}
