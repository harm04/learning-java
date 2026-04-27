import java.util.*;

class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of array2: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of array1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1 + n2];

        // copy arr1
        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        // copy arr2
        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i]; 
        }

        // print merged array
        System.out.println("Merged array: " + Arrays.toString(arr3));
    }
}