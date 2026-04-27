import java.util.*;

class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size - 1];
        int sumWithoutMissingNumber = 0;

        System.out.print("Enter the elements in array. Elements should be in sorted order: ");
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            sumWithoutMissingNumber += arr[i];
        }
        int sumWithMissingNumber = size * (size + 1) / 2;
        int missingNumber = sumWithMissingNumber - sumWithoutMissingNumber;
        System.out.print("missing number:" + missingNumber);
    }
}