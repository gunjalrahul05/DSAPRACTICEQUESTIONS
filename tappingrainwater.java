public class tappingrainwater{
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};

        int n=height.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = height[0];
        rightmax[n-1] = height[n-1];

        for(int i=1;i<n;i++){
            // if(leftmax[i-1]>height[i]){
            //     leftmax[i] = leftmax[i-1];
            // }else{
            //     leftmax[i] = height[i];
            // }

            leftmax[i] = Math.max(leftmax[i-1],height[i]);

        }
        for(int i=n-2;i>=0;i--){
            // if(rightmax[i+1]>height[i]){
            //     rightmax[i] = rightmax[i+1];
            // }else{
            //     rightmax[i] = height[i];            }

            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }

        int total=0;
        for(int i=0;i<n;i++){
            total = total+((Math.min(leftmax[i],rightmax[i]))-height[i]);
        }

        System.out.println("Total water tapped is :"+total);
    }
}