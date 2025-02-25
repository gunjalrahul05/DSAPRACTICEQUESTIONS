import java.util.Deque;
import java.util.LinkedList;
public class stackusingdeque {
    static class Stack{
        Deque stack = new LinkedList();

        public  void push(int data){
            stack.addLast(data);
        }
        public int pop(){
            return (int)stack.removeLast();
        }

        public int peek(){
            return (int)stack.getLast();
        }
    }
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
