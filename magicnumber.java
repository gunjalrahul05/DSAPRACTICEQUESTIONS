public class magicnumber {
    public static int size(int n){
        int size=0;


        while(n!=0){
            n/=10;
            size++;
        }

        return size;
    }
    public static void main(String[] args) {
        int n = 55555;
        int n2 = n;
        int newnum=0;
        int len = size(n);
        while(n!=0){
            int rem = n%10;
            newnum = newnum+(int)(Math.pow((int)rem,(int)len));
            n/=10;
        }

        if(newnum==n2){
            System.out.println("Magic");
        }else{
            System.out.println("Not magic");
        }
    }
}
