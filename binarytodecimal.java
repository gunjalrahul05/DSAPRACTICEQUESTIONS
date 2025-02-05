import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int newnum = 0;
        int var = 0;
        while(n!=0){
            int rem = n%10;
            newnum = (int) (newnum+ (rem*Math.pow(2,var)));
            var++;
            n/=10;
            System.out.println(newnum);
        }
        System.out.println("New num is "+newnum);
    }
}
