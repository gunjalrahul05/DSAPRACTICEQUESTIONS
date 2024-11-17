import java.util.*;
public class printsubarrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         for(int k=j;k<arr.length;k++){
        //             System.out.print(arr[k]);
        //         }
        //         System.out.print("\t");
        //     }
        //     System.out.println("\n");

        // }
//      
//count the number of subarrays
int ts = 0,maxsum = Integer.MIN_VALUE,minsum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    sum+=arr[k];
                }
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(minsum>sum){
                    minsum=sum;
                }
                System.out.print("="+sum);        
                System.out.print("\t");
                ts++;
            }
            System.out.println("\n");

        }

        System.out.println("Max sum = "+maxsum);
        System.out.println("minsum = "+minsum);

    }
}
 