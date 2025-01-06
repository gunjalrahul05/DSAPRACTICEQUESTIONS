public class searchin2darray {
    public static void main(String[] args) {
        int arr[][] = {{3,5,11,13,20},{6,7,12,15,21},{8,9,14,18,23},{19,24,28,30,35}};
        int target=67;

        int left=0;
        int right = 4;

        while(left<=arr.length-1&&right<=arr[0].length-1){
            if(target==arr[left][right]){
                System.out.println("Target is found at "+left+" "+right);
                System.exit(0);
            }
            else if(target<arr[left][right]){
                right--;
            }else {

                left++;
            
            }
        }
        System.out.println("Not found ");
    }
}
