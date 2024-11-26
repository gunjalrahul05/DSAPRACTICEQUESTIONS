import java.util.*;
public class subarraysum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};

        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=j;k<arr.length;k++){
                   sum+=arr[k];
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
            }

        }
        System.out.println("Max sum = "+maxsum);
    }
}