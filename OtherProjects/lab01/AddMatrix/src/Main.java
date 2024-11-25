import java.util.Scanner;

public class Main {



    public static void showMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mxn: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Declare a 2D array
        int[][] A = new int[n][m];

        // Read matrix
        System.out.print("Enter the first matrix: \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Declare a 2D array
        int[][] B = new int[n][m];

        System.out.print("Enter the second matrix: \n");

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Matrix result
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix 1: ");
        showMatrix(A);
        System.out.println("Matrix  2: ");
        showMatrix(B);
        System.out.println(">>> Add matrix: ");
        showMatrix(C);

    }

}

