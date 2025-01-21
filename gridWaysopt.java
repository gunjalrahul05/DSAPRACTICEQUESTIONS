public class gridWaysopt {
    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=3,m=3;

        int n1 = m-1+n-1;

        int nways = fact(m-1+n-1)/(fact(n-1)*fact(m-1));

        System.out.println("n ways = "+nways);
    }
}
