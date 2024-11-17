public class triangle {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){
            int cnt = 1;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print(cnt);
                if(j<i-1){
                    cnt++;
                }else{
                    cnt--;
                }
            }
            System.out.println();
        }

    }
}
