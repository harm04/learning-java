import java.util.*;

class BubbleSort {
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

        // bubble sorting
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array : " + Arrays.toString(arr));
    }
}