import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] sum = new int[n][n];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

