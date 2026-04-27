import java.util.*;

class LinearSearch {
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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.print("Element not found");
        }
    }
}