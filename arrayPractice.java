public class arrayPractice {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        //brute force approach;
        // int res[] = new int[arr.length];

        // for(int i=0;i<arr.length;i++){
        //     int mul=1;
        //     for(int j=0;j<arr.length;j++){
        //         if(j!=i){
        //             mul*=arr[j];
        //         }
        //     }
        //     res[i] = mul;
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(res[i]);
        // }


        // int n=nums.length;
        // int ans[] =new int[n];

        // ans[0] = 1;
        // for(int i=1;i<n;i++){
        //     ans[i] = ans[i-1] * nums[i-1];
        // }

        // for(int i=0;i<nums.length;i++){
        //     System.out.print(ans[i]+" ");
        // }
        // int suf = 1;
        // for(int i=n-2;i>=0;i--){
        //     suf*=nums[i+1];
        //     ans[i] *= suf;
        // }
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(ans[i]+" ");
        // }

        int suf[] = new int[nums.length];
        int pre[] = new int[nums.length];

        suf[0] = 1;
        for(int i=1;i<nums.length;i++){
            suf[i] = nums[i-1]*suf[i-1];
            System.out.println(suf[i]); 
        }
        System.out.println();
        pre[nums.length-1]=1;
        
        for(int i=nums.length-2;i>=0;i--){
            pre[i]=pre[i+1]*nums[i];
            System.out.println(pre[i]);
        }
      

    }

}
