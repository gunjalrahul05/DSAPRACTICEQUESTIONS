public class dublicateinarr {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int n=arr.length;
        int num=arr[0];
        for(int i=1;i<n;i++){
          num^=arr[i];
          System.out.println(num);
        }
        
    }
}   
