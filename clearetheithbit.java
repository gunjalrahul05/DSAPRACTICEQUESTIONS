public class clearetheithbit {
    public static int cleartheIthBit(int i,int n){
        int bitmax = ~(1<<i);
        
        return n&bitmax;
    
    }
    public static int UpdateIthBit(int i,int n,int bit){
        int n1 = cleartheIthBit(i, n);

        return n1|(bit<<i);


    }
    public static void main(String[] args) {
    int n = 15;
    int i=2;
    System.out.println("result "+UpdateIthBit(i,n,0));
    }

}
