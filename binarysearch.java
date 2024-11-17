
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int key ,arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key to search of array");
        key = sc.nextInt();

        System.out.println("ENter the elements of the array in sorted order");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        int st=0,end =4;

        while(st<=end){
            int mid=(st+end/2);

            if(arr[mid]==key){
                System.out.println("Element is found at ind5ex "+mid);
                System.exit(1);
            }
            else if(key<arr[mid]){
                end =mid-1; 
            }else{
                st =mid+1;
            }
        }
        System.out.println("Element not found");
    }
}
