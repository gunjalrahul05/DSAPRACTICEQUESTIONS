import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.println("Enter the number");
        int n = sc.nextInt();
        int binary = 0;
        int p=0;
        while(n!=0){
            int rem = n%2;
            binary=binary+(int)(rem*Math.pow(10, p));
            p++;
            n=n/2;

            System.out.println(rem);;
            System.out.println(binary);
            System.out.println(n);
        
        }
        System.out.println("decimal number = "+binary);
    }
}
