public class getithbitinbinary {
    public static void main(String[] args) {
        int i = 3;
    int n = 15;

    int bitmask = 1<<i;
    int res =  n & bitmask;

    if(res==0){
        System.out.println("i th bit is 0");
    }else{
        System.out.println("i the bit is 1");
    }
    }
}
