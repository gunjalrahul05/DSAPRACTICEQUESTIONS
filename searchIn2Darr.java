public class searchIn2Darr {
    public static boolean search(int arr[][], int key) {
        int row = 0;
        int col = arr.length - 1;
        System.out.println(col);
        // Time Complexity is O(m+n) where m number of rows n number of col;
        while (row != arr.length - 1 && col != 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at row " + row + " col " + col);
                return true;
            } else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 0 } };

        int key = 1;

        search(arr, key);

    }
}
