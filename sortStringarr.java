public class sortStringarr {
    public static void mergeSort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,ei,mid);
    }
    public static void merge(String arr[],int si,int ei,int mid){
        int i=si;
        int j=mid+1;
        int k=0;
        String temp[] = new String[ei-si+1];

        while(i<=mid&&j<=ei){
            if(arr[i].compareTo(arr[j])<0){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(int l=0,m=si;l<temp.length;l++,m++){
            arr[m] = temp[l];

        }


    }
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury"};

       
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
