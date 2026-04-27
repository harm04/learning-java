import java.util.*;

class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // input an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }

        // selection sort

        for (int i = 0; i < size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("sorted array: " + Arrays.toString(arr));
    }
}