public class spiralmatrixanti {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 12, 13, 14, 15, 16 } };

        int rowstart = 0;
        int rowend = arr.length-1;
        int colstart = 0;
        int colend = arr[0].length-1;

        while (rowstart <= rowend && colstart <= colend) {

            for (int i = rowstart; i <= rowend &&rowstart <= rowend; i++) {
                System.out.println(arr[i][colstart]);
            }
            colstart++;

            for (int i = colstart; i <= colend && colstart <=colend; i++) {
                System.out.println(arr[rowend][i]);
            }
            rowend--;
            for (int i = rowend; i >= rowstart &&colstart <= colend; i--) {
                System.out.println(arr[i][colend]);
            }
            colend--;
            for (int i = colend; i >= colstart&&rowstart <= rowend; i--) {
                System.out.println((arr[rowstart][i]));
            }
            rowstart++;
        }
    }
}
