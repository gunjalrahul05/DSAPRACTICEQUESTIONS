public class mergeSort2 {

    public void mergeSort(int arr[],int st,int end){
        if(st>=end){
            return;
        }

        int mid = (st+end)/2;

        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,st,end,mid);
    }

    public  void merge(int arr[],int st,int end,int mid){
        int i=st;
        int j=mid+1;
        int k=0;

        int temp[] = new int[end-st+1];

        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,2,7,30};
    }
}
