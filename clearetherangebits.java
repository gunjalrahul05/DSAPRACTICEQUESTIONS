public class clearetherangebits {
    public static void main(String[] args) {
        int n = 10;
        int i =2;
        int j =7;

        int a = ~0<<j+1;
        int b = 1<<2-1;
        int bitmask = a|b;

        System.out.println("Result = "+(n&bitmask));

    }
}
