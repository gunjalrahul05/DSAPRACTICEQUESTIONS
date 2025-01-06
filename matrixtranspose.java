public class matrixtranspose {
    public static void transpose(int arr[][]){
        
        int row = arr.length;
        int col=arr[0].length;
        
        int res[][] = new int[col][row];
        for(int i=0;i<row;i++){
            
            for(int j=0;j<col;j++){
                
                res[j][i] =arr[i][j];
                
            }
           
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,4,9},{11,4,3}};
        transpose(arr);
    }
}
