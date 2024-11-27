public class leetcode189{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};

        int n=nums.length;
        int k=3;
        int arr[] = new int[nums.length];
        
        if(nums==null||n==0){
            return;
        }
        for(int i=0;i<n;i++){
            arr[(i+k)%n] = nums[i];
        }
        for(int i=0;i<n;i++){
           
            System.out.println(arr[i]);
        }
        
    }
}