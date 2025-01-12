public class firstsolnQueen{
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

    public static int cnt= 0;
    public static boolean numQueen(char arr[][], int row) {

        if (row == arr.length) {
            cnt++;
            return true;
        }

        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                if(numQueen(arr, row+1)){
                    return true;
                }
                arr[row][j] = '-';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        char arr[][] = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = '-';
            }
        }

        if(numQueen(arr, 0)){
            System.out.println("Get the solution");
            display(arr);
        }
    }
}

