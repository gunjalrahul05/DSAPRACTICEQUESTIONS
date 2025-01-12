public class missingnumarr {
    public static void main(String[] args) {
        int arr[] = {3,2,1,0};
        int n=arr.length;
        
        for(int i=1;i<=n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    cnt++;
                }
            }
            if(cnt==0){
                System.out.println(i);
            }
        }
        
    }
    }

