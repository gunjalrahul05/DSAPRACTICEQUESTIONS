public class singlenuminarr {
    // class Solution {
    //brute force;
    //     public int singleNumber(int[] arr) {
    //         int n=arr.length;
    
    //         for(int i=0;i<n;i++){
    //             int cnt=0;
    //             for(int j=0;j<n;j++){
                    
    //                 if(arr[j]==arr[i]&&i!=j){
    //                     cnt++;
    //                 }
    //             }
    //             if((cnt==0)){
    //                 return arr[i]; 
    //             }
    //         }
    //         return 0;
    //     }
    // }

    // optimal approach
    // class Solution {
    //     public int singleNumber(int[] arr) {
    //         int n=arr.length;
    //         int num=arr[0];
    //         for(int i=1;i<n;i++){
    //           num^=arr[i];
    //         }
    //         return num;
    //     }
    // }
}
