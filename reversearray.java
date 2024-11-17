public class reversearray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,45,66,77};

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); 
        }
    }
}
