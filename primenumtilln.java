public class primenumtilln {
    public static void main(String[] args) {
        int arr[] = {1,4,3,3,2};
     int max = 0;
       for(int i=0;i<arr.length;i++){
        int temp=1;
        for(int j=i;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                temp++;
            }else{
                break;
            }
        }
        if(temp>max){
            max=temp;
        }
       }

       int max1= 0;
       for(int i=0;i<arr.length;i++){
        int temp1=1;
        for(int j=i;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                temp1++;
            }else{
                break;
            }
        }
        if(temp1>max1){
            max1=temp1;
        }
       }

       if(max1>max){
        System.out.println(max1);
       }else{
        System.out.println(max);
       }
    }
}
