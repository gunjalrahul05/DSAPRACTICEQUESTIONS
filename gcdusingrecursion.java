
public class gcdusingrecursion {
    public static int gcd(int a,int b){

        if(b==0){
            return a;
        }
        return gcd(b,b%a);
    }
    public static void main(String[] args) {
        int a = 18;
        int b= 24;

        System.out.println(gcd(a, b));
    }
}
