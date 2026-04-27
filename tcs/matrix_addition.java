import java.util.*;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int a[][] = new int[rows][columns];
        int b[][] = new int[rows][columns];
        int c[][] = new int[rows][columns];
        // input first matrix
        System.out.print("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter second matrix:");
        // input second matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // print c matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}