public class kokoeatbanana {
    public static int max(int arr[]){
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
     public static int sum(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        
        int arr[] = {3,6,7,11};
        int n = arr.length;

        int k;
        System.out.println(max(arr));
        int totalbananas=0,eatbananas=0;
        for(k= 2;k<max(arr);k++){
            for(int i=0;i<n;i++){
                if(arr[i]<k){
                    eatbananas+=arr[i];
                }else{
                    if(!(arr[i]>k)){
                        eatbananas+=k;
                    }
                }
            }
            System.out.println(eatbananas);
            if(eatbananas==sum(arr)){
                System.out.println(k);return;
            }
        }
    System.out.println("Not return anything");
    }
}
