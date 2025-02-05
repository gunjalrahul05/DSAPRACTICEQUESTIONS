import java.util.Stack;


public class stockspan {
    public static void stockspan(int arr[], int res[]){
        Stack s = new Stack();
        
        res[0] = 1;
        s.add(0);

       for(int i=1;i<arr.length;i++){
        int currVal = arr[i];
        while(!s.isEmpty() && currVal > arr[(int) s.peek()] ){
            s.pop();
        }

        if(s.isEmpty()){
            res[i] = i+1;
        }else{
            res[i] = i-(int)s.peek();
        }

        s.add(i);
       }

    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,85,100};

        int res[] = new int[arr.length];

        stockspan(arr,res);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i]);
        }
    }
}
