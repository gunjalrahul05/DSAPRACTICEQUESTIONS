public class selectionsort{
    public static void selectionsort1(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int smallpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallpos]>arr[j]){
                    smallpos=j;
                }
            }
            int temp = arr[smallpos];
            arr[smallpos] = arr[i];
            arr[i]=temp;
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};

        selectionsort.selectionsort1(arr);
        selectionsort.display(arr);

    }
}