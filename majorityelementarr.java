public class majorityelementarr {
    public static void main(String[] args) {
        int arr[] = {3,2,3};

        int cnt=0;
        int major = arr[0];
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                major=arr[i];
            }
            if(arr[i]==major){
                cnt++;
            }else{
                cnt--;
            }
        }
        System.out.println("major element is = "+major);
    }
}
