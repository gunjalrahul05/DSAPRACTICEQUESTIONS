import java.util.Stack;

public class dublicateparentheses {

    public static boolean check(String str){
        
        Stack<Character> s = new Stack();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt((i));

            if(c==')'){
                int count = 0;

                while(s.pop()!='('){
                    count++;
                }
                if(count<  1){
                    return true;
                }
            }else{
                s.push(c);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a+b)";

        System.out.println(check(str));

    }
}
