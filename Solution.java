// import java.util.Stack;

// public class onetoNbinarynum {
//     public static void main(String[] args){
//         int n =5;

//         Stack s = new Stack<>();

//         for(int i=1;i<=n;i++){
//             int num =i;

//             while(num!=0){
//                 int rem = num%2;
//                 num/=2;
//                 s.push(rem);
//             }

//             while(!s.isEmpty()){
//                 System.out.print(s.pop());
//             }

//             System.out.println();
//         }
//     }
// }
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static void generatePrintBinary(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generatePrintBinary(n);
    }
}
