public class spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        int rowstart = 0;
        int colstart = 0;
        int rowend = matrix.length - 1;
        int colend = matrix[0].length - 1;

        while (rowstart <= rowend && colstart <= colend) {

            for (int i = colstart; i <= colend; i++) {
                System.out.print(matrix[rowstart][i] + " ");
            }

            for (int i = rowstart + 1; i <= colend; i++) {
                System.out.print(matrix[i][rowend] + " ");
            }

            for (int i = colend - 1; i >= colstart; i--) {
                System.out.print(matrix[colend][i] + " ");
            }

            for (int i = rowend - 1; i >= rowstart + 1; i--) {
                System.out.print(matrix[i][rowstart] + " ");

            }

            rowstart++;
            colstart++;
            colend--;
            rowend--;

        }

    }
}
