import java.util.Scanner;

public class fibo {
    public static int  fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int fobo1 = fibonacci(n-1);
        int fobo2 = fibonacci(n-2);

        return fobo1+fobo2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));


    }
}
