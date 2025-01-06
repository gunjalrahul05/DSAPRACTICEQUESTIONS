public class setIthbit {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int bitmask = 1<<i;
//here we perform the | or operation because the we only want to convert the only one bit not all 
//if we use the & then all the bits gets converted
        System.out.println("result = "+(n|bitmask));
    }
}
