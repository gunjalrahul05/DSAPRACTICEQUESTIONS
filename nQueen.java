public class nQueen {
    public static void display(char arr[][]) {
        System.out.println("----------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char arr[][], int row, int col) {

        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; j <arr.length && i >= 0; j++, i--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void numQueen(char arr[][], int row) {

        if (row == arr.length) {
            display(arr);
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                numQueen(arr, row + 1);
                arr[row][j] = '-';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '-';
            }
        }

        numQueen(arr, 0);
    }
}
