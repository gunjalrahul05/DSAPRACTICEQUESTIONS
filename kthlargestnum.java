public class kthlargestnum {
    public static void main(String[] args) {
        int s=-7,e=7;

        int k = 8;

        int ans = e-((2*k)-2);

        if(e%2==0){
            ans-=1;
        }
        if(ans<s||ans>e){
            System.out.println("0");
        }else{
            System.out.println(ans);
        }
    }
}
