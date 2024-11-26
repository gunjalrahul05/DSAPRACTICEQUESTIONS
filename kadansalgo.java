public class kadansalgo{
    public static void main(String[] args){

        int arr[] = {-1,-2,-3,-1};

        int currsum=0,maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];

            if(currsum<0&&i!=arr.length-1){
                currsum=0;
            }
            if(maxsum<currsum){
                maxsum=currsum;
                System.out.println("in max sum"+i);
            }else if(currsum<0){
                maxsum=currsum;
            }
            
        }
       
        System.out.println("Max sum = "+maxsum);
    }
}