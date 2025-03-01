public class leetcode1663 {
    public static void main(String[] args) {
        int n=97953;
        int k=112103;
        String s ="";
        for(int i=n-1;i>=0;i--){
            k-=i;

            if(k>0){
                if(k>=26){
                    s='z'+s;
                    k-=26;
                }else{
                    char ch = (char)(k+97-1);
                    s=ch+s;
                    k=0;
                }
            }else{
                break;
            }

            k+=i;
        }
        System.out.println(s);
    }
}
