public class ratinMaze {

    public static int  cnt=0;
    public static int nWays(int arr[][],int row,int col,int n){

        if(row==n){
            cnt++;
            return 1;
        }
       
        int w1 = nWays(arr, row, col, n);
        int w2 = nWays(arr, row, col, n);
        int w3 = nWays(arr, row, col, n);
        int w4 = nWays(arr, row, col, n);

        return w1+w2+w3+w4;
    }
    public static void main(String[] args) {
        int maze[][] = {
                { 1, 1, 1, 1 },
                { 0, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 1, 1 } };

                nWays(maze, 0, 0, maze.length);

                System.out.println("Total number of ways "+cnt);
    }
}
