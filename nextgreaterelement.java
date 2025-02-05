import java.util.Stack;

public class nextgreaterelement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        
        int res[] = new int[arr.length];

        Stack s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[(int) s.peek()]<=arr[i]){ 
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = arr[(int) s.peek()];
            }

            s.add(i);
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        //System.out.println(res);
    }
}
