public class quickSort {
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quicksort(arr, si, pIdx - 1);
        quicksort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int i = si - 1;
        int pivot = arr[ei];

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };

        displayArr(arr);

        quicksort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting");
        displayArr(arr);

    }
}
