import java.util.*;

class FindMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int min = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < size - 1; i++) {

            if (arr[i + 1] > arr[i]) {
                min = arr[i];
            } else {
                min = arr[i + 1];
            }
        }
        System.out.println("min: " + min);

    }
}