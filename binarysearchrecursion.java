public class binarysearchrecursion {
    public static int binarySearch(int arr[], int target, int s, int e) {
        int mid = (s + e) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, e);
        } else {
            return binarySearch(arr, target, s, mid - 1);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };

        System.out.println(binarySearch(arr, 8, 0, arr.length - 1));

    }
}
