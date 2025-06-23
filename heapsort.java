public class heapsort {
    public static void heapify(int arr[],int i,int len){

        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if(left<len&&arr[left]<arr[minIdx]){
            minIdx = left;
        }

        if(right<len&&arr[right]<arr[minIdx]){
            minIdx = right;
        }

        if(minIdx!=i){

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapify(arr, minIdx, len);
        }
    }

    public static void heapsort(int arr[]){

        int n = arr.length;

        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;


            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {

        int arr[] = {4,5,2,1,6};

        heapsort(arr);
        

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
