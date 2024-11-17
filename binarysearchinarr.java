import java.util.Arrays;
import java.util.Scanner;

public class binarysearchinarr {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 1, 3, 77, 54, 32 };

        Arrays.sort(arr);

        int st = 0, end = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int key = sc.nextInt();

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == key) {
                System.out.println("Key found");
                System.exit(0);
            } else if (key > arr[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Key not found");
    }
}
