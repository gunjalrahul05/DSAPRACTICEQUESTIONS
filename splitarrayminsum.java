import java.util.Arrays;

public class splitarrayminsum {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4};

        int k=3;

        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        System.out.println("Sum = "+sum);
    }
}
