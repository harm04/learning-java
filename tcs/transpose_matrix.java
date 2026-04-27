import java.util.*;

class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int a[][] = new int[rows][columns];
        int b[][] = new int[columns][rows];

        // input matrix
        System.out.print("Enter first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                b[j][i] = a[i][j];
            }
        }

        // print b matrix
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}