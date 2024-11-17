import java.util.Scanner;

public class matrixmul2 {
    public static void accept(int arr[][], int r, int c, Scanner sc) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void display(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows for mat 1");
        r1 = sc.nextInt();

        System.out.println("Enter the columns for mat 1");
        c1 = sc.nextInt();

        System.out.println("Enter the rows for mat 2");
        r2 = sc.nextInt();

        System.out.println("Enter the columns for mat 2");
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Please enter the right number of colunm and rows");
            System.exit(0);
        }
        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];

        int mul[][] = new int[r1][c2];

        System.out.println("Enter the first array");
        matrixmul.accept(arr1, r1, c1, sc);
        System.out.println("Enter the second array");
        matrixmul.accept(arr2, r2, c2, sc);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                int l = 0, n = 0;
                while (l < r2 && n < c1) {
                    sum += (arr1[i][l] * arr2[n][j]);
                    l++;
                    n++;
                }
                mul[i][j] = sum;

            }

        }
        System.out.println("First array");
        matrixmul.display(mul, r1, c2);
      
    }
}
