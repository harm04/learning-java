

import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int digit = 1;
        while (n != 0) {
            digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        System.out.print(temp==sum?"Armstrong":"not Armstrong");
    }
}