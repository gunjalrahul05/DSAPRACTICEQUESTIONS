public class bubblesort{
    public static void bubblesort1(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void main(String[] args){

        int arr[]={5,3,2,4,1};

        bubblesort.bubblesort1(arr);
        bubblesort.display(arr);
    }
}