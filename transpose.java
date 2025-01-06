public class transpose {
    public static void display(int arr[][]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{14,15,16,17}};

    //for initial position
    //only valid for the square matrix.

    // int n=arr.length;

    // int col=0;
    
   
    // display(arr);
    // while(col<n){

    //     int i = col;
    //     for(int j=col;j<n;j++){
    //         int temp = arr[i][j];
    //         arr[i][j]=arr[j][i];
    //         arr[j][i] = temp;
    //     }
    //     col++;
        
    // }
    // System.out.println("Transpose of matrix");
    // display(arr);


    //for m * n matrix;

    int n=arr.length;
    int m = arr[0].length;

    int ans[][] = new int[m][n];

    display(arr);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            ans[j][i] = arr[i][j];
        }
    }

    System.out.println("Transpose of matrix");
    display(ans);
    }

}
