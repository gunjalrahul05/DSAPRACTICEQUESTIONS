public class searchinrotatedarr{
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int target=3,k=3,n=arr.length;

        int start=0,end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            
            int newmid=(mid+k)%n;
            if(arr[newmid]==target){
                System.out.println("element found at"+newmid);
                System.exit(0);
            }else if(arr[newmid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println("-1");
    }
}