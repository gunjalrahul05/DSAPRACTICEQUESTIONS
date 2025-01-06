public class swapwithout3 {
    public static void main(String[] args) {
        int n1= 10,n2=20;

        System.out.println("Before sorting n1= "+n1+" n2 = "+n2);

        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;

        System.out.println("After sorting n1 = "+n1 +" n2 = "+n2);

        // System.out.println(~5);
        
    }
}
