public class rowAddition {
    public static void main(String[] args) {
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[1][i];
        }
        System.out.println("Sum = "+sum);
    }
}
