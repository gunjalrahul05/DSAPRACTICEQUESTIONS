import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class sortedstack {

    public static void sort(Stack s){
        ArrayList<Integer> temp = new ArrayList<>();

        while(!s.isEmpty()){
            temp.add((int)s.pop());
        }
        Collections.sort(temp);
        
        for(int i=0;i<temp.size();i++){
            s.push(temp.get(i));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();


        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);

        System.out.println("Start the execution");


        sort(s);
        System.out.println("Enter the sort");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
}
