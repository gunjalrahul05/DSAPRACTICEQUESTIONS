
public class diagonalsum {
    public static int diagonalsum(int arr[][]){
        int sum = 0;
        int r=arr.length;
        int c=arr[0].length;
        //brute force approach
        // if(r!=c){
        //     return 1;
        // }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }else if(i+j==r-1&&i!=j){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<r;i++){
            sum+=arr[i][i];

            if(i!=r-1-i){
                sum+=arr[i][r-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        int sum = diagonalsum(arr);
 
        System.out.println("Sum of diagonal element is "+sum);
    }
}
