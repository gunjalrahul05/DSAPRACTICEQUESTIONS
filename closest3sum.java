import java.util.HashMap;

public class closest3sum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,10,2147483647,9};
        HashMap<Integer,Integer> hm =new HashMap<>();

        if(nums.length==1&&(nums[0]>1||nums[0]<0)){
            System.out.println("1");;
        }
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }

        int big=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>big){
                big=nums[i];
            }
        }
        if(big<0){
            System.out.println("1");
            return;
        }
        int small=0;
        System.out.println(big);
        for(int i=1;i<big-1000;i++){
            System.out.println(" i am in loop");
            if(!hm.containsKey(i)){
                small=i;
                break;
            }
        }
        System.out.println("small "+small);
    }
}
