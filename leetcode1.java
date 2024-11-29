import java.util.*;
public class leetcode1{
    public static void main(String[] args){
        int arr[] = {3,2,4};
        int target = 6;
        Arrays.sort(arr);
       int res[] = new int[2];
        int n=arr.length;
        int st=0,end=n-1;
        while(st<end){
            if(arr[st]+arr[end]==target){
                res[0] = st;
                res[1] = end;
                break;
            }
            else if(arr[st]+arr[end]>target){
                end--;
            }else{
                st++;            }
        }
        System.out.println(res[0]+" "+res[1]);
    }
}