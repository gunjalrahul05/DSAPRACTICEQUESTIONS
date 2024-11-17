public class bookallocation{
    public static boolean isValid(int arr[],int n,int m,int maxAllowedPages){
        int student = 1,pages = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>maxAllowedPages){
                return false;
            }

            if(pages+arr[i] <= maxAllowedPages){
                pages+=arr[i];
            }else{
                student++;
                pages=arr[i];
            }
        }

        return student > m ? false : true;
    }
    public static int allocateBooks(int arr[],int n,int m){
        if(m>n){
            return -1;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int ans = -1;
        int st=0,end=sum;//range of possible answers 

        while(st<=end){//O(logN) and when the isvalid function is calling from the 
                        //while it will count the complexity of the isvalids for loop
                        //so its become the O(logN*n);
            int mid=st+(end-st)/2;

            if(bookallocation.isValid(arr,n,m,mid)){
                ans=mid;
                end = mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {15,17,20};
        int n=3,m=2;

        System.out.println(bookallocation.allocateBooks(arr,n,m));
        
    }
}