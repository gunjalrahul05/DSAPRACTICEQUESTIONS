public class checkpowerof2ornot {
    
    public static void main(String[] args) {
        int n =15;

        if((n&(n-1))==0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not power of 2");
        }
    }
}
