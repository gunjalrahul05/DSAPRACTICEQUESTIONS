import java.util.*;
public class maxsubarraysum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};

        int[] prefix = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }
}