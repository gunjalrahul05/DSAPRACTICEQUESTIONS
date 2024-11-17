import java.util.Scanner;

public class matrixmul {
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
        int r, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows");
        r = sc.nextInt();

        System.out.println("Enter the columns");
        c = sc.nextInt();

        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];

        int mul[][] = new int[r][c];

        System.out.println("Enter the first array");
        matrixmul.accept(arr1, r, c, sc);
        System.out.println("Enter the second array");
        matrixmul.accept(arr2, r, c, sc);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                int l = 0, n = 0;
                while (l < r && n < c) {
                    sum += (arr1[i][l] * arr2[n][j]);
                    l++;
                    n++;
                }
                mul[i][j] = sum;

            }

        }

        System.out.println("First array");
        matrixmul.display(mul, r, c);
        // System.out.println("Second array");
        // matrixmul.display(arr2,r,c);

    }
}
