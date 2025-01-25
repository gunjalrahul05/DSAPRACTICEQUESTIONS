import java.util.Stack;

public class reversestrusingstack {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb  = new StringBuilder();
        while(!s.isEmpty()){
            char ch = s.pop();
            sb.append(ch);
        }

        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str = "Rahul";

        System.out.println(reverse(str));;
    }
}
