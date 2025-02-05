import java.util.Stack;

public class maxareahistogram {

    public static int maxarea(int arr[]){
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        //right nearest short

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.add(i);
        }
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.add(i);
        }


        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;

            int area = height*width;
             maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
    public static void main(String[] args) {
        int arr[] = {9,0};

        System.out.println(maxarea(arr));

    }
}
