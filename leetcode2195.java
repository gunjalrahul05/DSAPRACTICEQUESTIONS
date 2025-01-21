public class leetcode2195 {
    public static void main(String[] args) {
        int arr[] = {1,1000,2};

        int key=1000;
        int n = arr.length;

        int target =0;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==key&&cnt==0){
                target=arr[i+1];
                cnt++;
            }

            if(arr[i]==key&& arr[i+1]==target&&cnt!=0){
                cnt++;
            }else if(arr[i]!=key&&arr[i+1]!=target&& cnt!=0){
                cnt--;
                
            }
            
        }
        System.out.println(target);

    }
}
