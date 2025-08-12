public class dp_fibonacci {
    public static int fibo_memorization(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        dp[n] = fibo_memorization(n-1,dp)+fibo_memorization(n-2,dp);
        System.out.println(dp[n]);
        return dp[n];
    }

    
    public static void main(String[] args) {
        int n=5;
        int dp[] = new int[n+1];
        // System.out.println(fibo_memorization(n,dp));

        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
