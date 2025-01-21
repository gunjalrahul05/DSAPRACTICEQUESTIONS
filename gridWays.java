public class gridWays {
    public static int nGridWays(int i,int j,int n,int m){

        if(i==n-1&&j==m-1){
            return 1;
        }else if(i==n||j==m){
            return 0;
        }
        int w1 = nGridWays(i+1, j, n, m);
        int w2 = nGridWays(i, j+1, n, m);

        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3;int m = 3;
        int totalways = nGridWays(0, 0, n, m);

        System.out.println("Total ways are "+totalways);
    }
}
