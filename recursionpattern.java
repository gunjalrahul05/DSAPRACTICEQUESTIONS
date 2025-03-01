public class recursionpattern {
    public static void pattern(int n){
        if(n==1){
            System.out.println("1");
            return;
        }

        System.out.println(n);

        pattern(n-1);

        System.out.println(n);
    }
    public static void main(String[] args) {
        pattern(4);
        
    }
}
