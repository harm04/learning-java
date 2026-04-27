import java.util.*;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int element = sc.nextInt();
        boolean found = false;
        int li = 0;
        int hi = size - 1;
        int mid = (li + hi) / 2;
        while (li <= hi) {
            if (arr[mid] == element) {
                found = true;
                break;
            } else if (arr[mid] > element) {
                hi = mid - 1;
            } else {
                li = mid + 1;
            }
            mid = (li + hi) / 2;
        }
        System.out.println(found ? "True" : "False");
    }
}