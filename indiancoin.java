public class indiancoin {
    public static void main(String[] args){
        int arr[] = {1,2,5,10,20,50,100,200,500,2000};
        int amt = 590;

        int cnt=0;
        for(int i=arr.length-1;i>=0;i--){
            while(arr[i]<=amt){
                cnt++;
                amt-=arr[i];
            }
            
        }
        System.out.println(cnt);
    }
}
