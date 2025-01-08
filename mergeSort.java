public class mergeSort {
    public static void mergeSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, ei, mid);


    }

    public static void merge(int arr[],int si,int ei,int mid){
        int i = si;//iterator for left index
        int j = mid+1;//iterator for right index
        int k = 0;//iterator for temp array
        int temp[] = new int[ei-si+1];

        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(int l=0,m=si;l<temp.length;l++,m++){
            arr[m]=temp[l];
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,1,2,0,0};
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting");
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

    }
}
