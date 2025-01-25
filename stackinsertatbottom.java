import java.util.Stack;

public class stackinsertatbottom {
    public static void addatbottom(Stack<Integer> s,int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }

        int data = s.pop();
        addatbottom(s, n);
        s.push(data);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        System.out.println(s);
        addatbottom(s,5);

        System.out.println(s);
    }
}
