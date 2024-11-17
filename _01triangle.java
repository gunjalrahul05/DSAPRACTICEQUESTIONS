public class _01triangle {
    public static void main(String[] args) {
            int n = 5 ;

        int cnt = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //System.out.print(cnt);
                // if(cnt==1){
                //     cnt=0;
                // }else{
                //     cnt=1;
                // }

                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();;
        }
    }
}
